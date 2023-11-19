package hu.me.iit.hitchhikers_guide_galaxy;

import hu.me.iit.knowledge_base.LifeUniverseEverythingServiceOraculum;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DeepThoughtSupercomputerService implements LifeUniverseEverythingServiceOraculum {
    private int instanceId;
    private int answer;

    @PostConstruct
    private void init() {
        log.info("DeepThoughtSupercomputerService");
    }

    @Override
    public String getResponseForUltimateQuestion() {
        return String.format("%d-%d", answer, instanceId);
    }

    @Value("${instance-id}")
    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    @Value("${answer-id:42}")
    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
