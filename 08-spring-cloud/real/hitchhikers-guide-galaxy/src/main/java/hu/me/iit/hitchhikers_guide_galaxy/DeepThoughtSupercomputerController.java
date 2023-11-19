package hu.me.iit.hitchhikers_guide_galaxy;

import hu.me.iit.knowledge_base.LifeUniverseEverythingServiceOraculum;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("oraculum")
public class DeepThoughtSupercomputerController {
    private final LifeUniverseEverythingServiceOraculum lifeUniverseEverythingServiceOraculum;

    @PostConstruct
    private void init() {
        log.info("KnowledgeBaseController");
    }

    @GetMapping("ultimate-response")
    String getResponseForUltimateQuestion() {
        return lifeUniverseEverythingServiceOraculum.getResponseForUltimateQuestion();
    }
}
