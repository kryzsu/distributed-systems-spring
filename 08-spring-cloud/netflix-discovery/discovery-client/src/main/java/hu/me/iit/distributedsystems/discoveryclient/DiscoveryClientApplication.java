package hu.me.iit.distributedsystems.discoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// @EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class DiscoveryClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryClientApplication.class, args);
    }
}
