package com.example.demo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MessageWithId {
    private UUID messageId;
    private LocalDateTime dateTime;
    private String message;
    private String room;
    private String senderUser;
}
