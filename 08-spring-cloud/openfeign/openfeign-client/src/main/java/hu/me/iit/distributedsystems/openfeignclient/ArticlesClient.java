package hu.me.iit.distributedsystems.openfeignclient;

import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("articles")
public interface ArticlesClient {

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> allArticles();
    @PostMapping(path="")
    void newArticle(@RequestBody @Valid ArticleDto articleDto);
    @PutMapping(path="/")
    void replaceArticle(@RequestBody @Valid ArticleDto articleDto);
    @DeleteMapping (path="/{id}")
    void deleteArticle(@PathVariable("id") Long id);
}
