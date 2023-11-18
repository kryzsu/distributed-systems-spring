package hu.me.iit.distributedsystems.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private Environment env;

    @Autowired
    public void setEnv(Environment env) {
        this.env = env;
    }

    @GetMapping("/")
    public String main() {
        return "actual value:" + env.getProperty("info.foo");
    }
}
