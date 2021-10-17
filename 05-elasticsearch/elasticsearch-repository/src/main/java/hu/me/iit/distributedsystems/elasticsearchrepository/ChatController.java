package hu.me.iit.distributedsystems.elasticsearchrepository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("chat")
public class ChatController {
    private final ChatMessageRepository chatMessageRepository;

    @PostMapping()
    public void newData(@RequestBody @Valid ChatMessageDto chatMessageDto) {
        chatMessageRepository.save(
                ChatMessage.builder()
                        .id(chatMessageDto.getId())
                        .message(chatMessageDto.getMessage())
                        .sender(chatMessageDto.getSender())
                        .roomId(chatMessageDto.getRoomId())
                        .roomName(chatMessageDto.getRoomName())
                        .build()
        );
    }

    @GetMapping()
    public Page<ChatMessage> findBySender(@RequestBody @Valid FindByDto senderDto) {
        return chatMessageRepository.findBySenderOrMessage(
                senderDto.getQuery(),
                senderDto.getQuery(),
                PageRequest.of(0, 10));
    }
}
