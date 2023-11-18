package hu.me.iit.hitchhikers_guide_galaxy.elasticsearchrepository;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.v3.oas.annotations.Operation;
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
        chatMessageRepository.save( chatMessageDto.toDocument() );
    }

    @Operation(summary = "Get a book by its id")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "findByDto",
                    value = "Object to be created", required = true,
                    dataType = "hu.me.iit.distributedsystems.elasticsearchrepository.FindByDto",
                    paramType = "body")

    )
    @GetMapping(consumes = "application/json")
            public Page<ChatMessage> findMessage(
            @RequestBody @Valid FindByDto findByDto
    ) {
        return chatMessageRepository.findBySender(
                findByDto.getQuery(),
                PageRequest.of(0, 10));
    }
}
