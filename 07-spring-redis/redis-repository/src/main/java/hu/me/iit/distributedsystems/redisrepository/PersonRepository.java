package hu.me.iit.hitchhikers_guide_galaxy.redisrepository;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
}
