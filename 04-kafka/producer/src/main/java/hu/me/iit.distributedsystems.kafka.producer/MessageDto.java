package hu.me.iit.distributedsystems.kafka.producer;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class MessageDto {
    @NotNull
    Long roomId;
    @NotBlank
    private String message;
    @NotBlank
    private String room;
    @NotBlank
    private String senderUser;
}
