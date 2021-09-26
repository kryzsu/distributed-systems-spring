package com.example.demo.impl;

import com.example.demo.MessageDto;
import com.example.demo.MessageWithId;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Slf4j
@AllArgsConstructor
@Service
public class MainService implements com.example.demo.MainService {
    private final KafkaTemplate<Long, String> kafkaTemplate;
    private final String TOPIC_NAME = "chat-rooms";
    private final ObjectMapper objectMapper;

    @Override
    public void sendMessage(MessageDto message) throws JsonProcessingException, ExecutionException, InterruptedException {

        MessageWithId messageWithId = new MessageWithId();
        messageWithId.setMessageId(UUID.randomUUID());
        messageWithId.setDateTime(LocalDateTime.now());
        messageWithId.setMessage(message.getMessage());
        messageWithId.setRoom(message.getRoom());
        messageWithId.setSenderUser(message.getSenderUser());

        Long roomId = message.getRoomId();

        String value = objectMapper.writeValueAsString(messageWithId);

        ProducerRecord<Long, String> producerRecord = buildProducerRecord(roomId, value, TOPIC_NAME);
        ListenableFuture<SendResult<Long, String>> listenableFuture = kafkaTemplate.send(producerRecord);
        listenableFuture.addCallback(new ListenableFutureCallback<SendResult<Long, String>>() {

            @Override
            public void onSuccess(SendResult<Long, String> result) {
                handleSuccess(roomId, value, result);
            }

            @Override
            public void onFailure(Throwable ex) {
                handleFailure(roomId, value, ex);
            }
        });
        listenableFuture.get();
    }

    private void handleFailure(Long roomId, String value, Throwable ex) {
        log.error(String.format("failed message %d %s %s", roomId, value, ex.toString()));
    }

    private void handleSuccess(Long roomId, String value, SendResult<Long, String> result) {
        log.info(String.format("success message %d %s %s", roomId, value, result.toString()));
    }

    private ProducerRecord<Long, String> buildProducerRecord(Long key, String value, String kafkaTopic) {
        return new ProducerRecord<Long, String>(kafkaTopic, null, key, value, null);
    }

}
