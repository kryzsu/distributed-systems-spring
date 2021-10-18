package com.example.messagingstompwebsocket;

import lombok.Data;

@Data
public class OutGoingChatMessage {
    private String arrivedMessage;
    private String sender;
    private String target;

    public OutGoingChatMessage(IncomingChatMessage input) {
        this.arrivedMessage = input.getMessage();
        this.sender = input.getSender();
        this.target = input.getTarget();
    }

}
