package hu.me.iit.hitchhikers_guide_galaxy.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer implements MessageListener<Long, String> {
    private final String TOPIC_NAME = "chat-rooms";

    @KafkaListener(topics = { TOPIC_NAME })
    public void onMessage(ConsumerRecord<Long, String> consumerRecord) {
        log.info("ConsumerRecord : {}", consumerRecord);
    }

}
