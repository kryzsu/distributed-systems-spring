package hu.me.iit.distributedsystems.elasticsearchrepository;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.validation.constraints.NotBlank;

@Data
public class ChatMessageDto {
    private String id;
    @NotBlank
    private String message;
    @NotBlank
    private String sender;
    @NotBlank
    private String roomId;
    @NotBlank
    private String roomName;
}
