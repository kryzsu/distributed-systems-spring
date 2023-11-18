package hu.me.iit.hitchhikers_guide_galaxy.elasticsearchrepository;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class FindByDto {
    @NotBlank
    private String query;
}
