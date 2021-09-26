package com.example.demo;

import com.example.demo.impl.MainService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class MainController {

    private final MainService mainService;

    @RequestMapping(path="/send-message")
    public void sendMessage(@Valid @RequestBody MessageDto messageDto) throws JsonProcessingException {
        mainService.sendMessage(messageDto);
    }

}
