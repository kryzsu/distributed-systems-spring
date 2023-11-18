package hu.me.iit.distributedsystems.discoveryclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="people", url = "http://localhost:8081")
public interface PeopleManager {
    @GetMapping( "/people/{id}")
    People get(@PathVariable("id") Long id);
}
