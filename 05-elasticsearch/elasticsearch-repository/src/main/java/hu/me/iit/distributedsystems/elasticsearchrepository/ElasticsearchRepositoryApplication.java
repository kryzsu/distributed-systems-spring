package hu.me.iit.distributedsystems.elasticsearchrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class ElasticsearchRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchRepositoryApplication.class, args);
	}

}
