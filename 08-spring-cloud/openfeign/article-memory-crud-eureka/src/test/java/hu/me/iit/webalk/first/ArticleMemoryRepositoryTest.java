package hu.me.iit.webalk.first;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArticleMemoryRepositoryTest {

    @Test
    void findAll_Emty() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();

        // WHEN
        List<ArticleDto> result = articleMemoryRepository.findAll();

        // THEN
        assertEquals(0, result.size());
    }

    @Test
    void findAll_NotEmpty() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(2L);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        List<ArticleDto> result = articleMemoryRepository.findAll();

        // THEN
        assertEquals(1, result.size());
        assertEquals(articleDto, result.get(0));
    }

    @Test
    void findArticleById() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        Long id = 2L;
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(id);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        int result = articleMemoryRepository.findArticleById(id);

        // THEN
        assertEquals(0, result);
    }

    @Test
    void findArticleById_NotFound() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        Long id = 2L;
        Long notExistsId = 4L;
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(id);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        int result = articleMemoryRepository.findArticleById(notExistsId);

        // THEN
        assertEquals(-1, result);
    }

    @Test
    void deleteById_exists() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        Long id = 2L;
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(id);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        articleMemoryRepository.deleteById(id);

        // THEN
        assertEquals(0, articleMemoryRepository.findAll().size());
    }

    @Test
    void deleteById_notExists() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        Long id = 2L;
        Long notExistsId = 4L;
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(id);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        articleMemoryRepository.deleteById(notExistsId);

        // THEN
        assertEquals(1, articleMemoryRepository.findAll().size());
    }

    @Test
    void getById_notExists() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        Long id = 2L;
        Long notExistsId = 4L;
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(id);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        ArticleDto dto = articleMemoryRepository.getById(notExistsId);

        // THEN
        assertNull(dto);
    }

    @Test
    void getById_Exists() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        Long id = 2L;
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(id);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        ArticleDto dto = articleMemoryRepository.getById(id);

        // THEN
        assertEquals(articleDto, dto);
    }

    @Test
    void save_update() {
        // GIVEN
        ArticleMemoryRepository articleMemoryRepository = new ArticleMemoryRepository();
        Long id = 2L;
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Author");
        articleDto.setPages(23);
        articleDto.setId(id);
        articleDto.setTitle("title");

        articleMemoryRepository.save(articleDto);

        // WHEN
        ArticleDto articleDto2 = new ArticleDto();
        articleDto2.setAuthor("Author 2");
        articleDto2.setPages(14);
        articleDto2.setId(id);
        articleDto2.setTitle("title 2");

        articleMemoryRepository.save(articleDto2);

        // THEN
        List<ArticleDto> articleDtoList = articleMemoryRepository.findAll();
        assertEquals(1, articleDtoList.size());

        assertEquals(articleDto2, articleDtoList.get(0));
    }
}