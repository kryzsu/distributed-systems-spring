package hu.me.iit.distributedsystems.openfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenfeignClientApplication.class, args);
	}
}
