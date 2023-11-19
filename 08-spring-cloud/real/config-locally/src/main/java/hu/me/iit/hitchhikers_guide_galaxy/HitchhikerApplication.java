package hu.me.iit.hitchhikers_guide_galaxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("hu.me.iit")
public class HitchhikerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HitchhikerApplication.class, args);
    }
}