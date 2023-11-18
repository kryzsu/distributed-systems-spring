package hu.me.iit.hitchhikers_guide_galaxy.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.concurrent.ExecutionException;
import java.lang.InterruptedException;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.me.iit.hitchhikers_guide_galaxy.kafka.producer.impl.MainService;

@RestController
@AllArgsConstructor
public class MainController {

    private final MainService mainService;

    @RequestMapping(path="/send-message")
    public void sendMessage(@Valid @RequestBody MessageDto messageDto)
            throws JsonProcessingException, ExecutionException, InterruptedException {
        mainService.sendMessage(messageDto);
    }

}
