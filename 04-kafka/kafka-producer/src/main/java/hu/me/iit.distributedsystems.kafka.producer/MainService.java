package hu.me.iit.hitchhikers_guide_galaxy.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.concurrent.ExecutionException;

public interface MainService {
    void sendMessage(MessageDto message) throws JsonProcessingException, ExecutionException, InterruptedException;
}
