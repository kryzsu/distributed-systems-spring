package hu.me.iit.distributedsystems.elasticsearchrepository;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class FindBySenderDto {
    @NotBlank
    private String senderName;
}
