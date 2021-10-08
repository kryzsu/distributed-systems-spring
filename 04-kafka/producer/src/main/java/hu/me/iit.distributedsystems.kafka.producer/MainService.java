package hu.me.iit.distributedsystems.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.concurrent.ExecutionException;

public interface MainService {
    void sendMessage(MessageDto message) throws JsonProcessingException, ExecutionException, InterruptedException;
}
