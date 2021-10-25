package hu.me.iit.distributedsystems.redisrepository;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
}
