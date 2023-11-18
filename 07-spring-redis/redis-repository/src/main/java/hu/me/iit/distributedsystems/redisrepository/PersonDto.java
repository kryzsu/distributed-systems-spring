package hu.me.iit.hitchhikers_guide_galaxy.redisrepository;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class PersonDto {
    private String id;

    @NotEmpty
    private String firstname;
    @NotEmpty
    private String lastname;

    Person toPerson() {
        return Person.builder()
                .id(id)
                .firstname(firstname)
                .lastname(lastname)
                .build();
    }

    PersonDto(Person person) {
        this.id = person.getId();
        this.firstname = person.getFirstname();
        this.lastname = person.getLastname();
    }
}
