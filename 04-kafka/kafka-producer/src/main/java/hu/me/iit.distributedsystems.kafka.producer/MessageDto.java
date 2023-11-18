package hu.me.iit.hitchhikers_guide_galaxy.kafka.producer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


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
