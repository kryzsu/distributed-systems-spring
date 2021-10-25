package hu.me.iit.distributedsystems.discoveryclient;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final EurekaClient discoveryClient;

    private String appName;

    @Value("${spring.application.name}")
    public void setAppName(String appName) {
        this.appName = appName;
    }

    @GetMapping("/")
    InstanceInfo getMyInstanceInfo() {
        return discoveryClient.getNextServerFromEureka(this.appName, false);
    }

    @GetMapping("/all")
    Applications getAllService() {
        return discoveryClient.getApplications();
    }
}
