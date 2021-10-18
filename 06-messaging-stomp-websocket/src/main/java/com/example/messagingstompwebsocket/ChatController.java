package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/chat/message")
    public OutGoingChatMessage greeting(IncomingChatMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new OutGoingChatMessage(message);
    }
}
