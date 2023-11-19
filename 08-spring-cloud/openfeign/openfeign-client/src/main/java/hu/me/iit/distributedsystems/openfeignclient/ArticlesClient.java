package hu.me.iit.distributedsystems.openfeignclient;

import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("articles")
public interface ArticlesClient {

    @GetMapping(path="article", produces= MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> allArticles();
    @PostMapping(path="article")
    void newArticle(@RequestBody @Valid ArticleDto articleDto);
    @PutMapping(path="article/")
    void replaceArticle(@RequestBody @Valid ArticleDto articleDto);
    @DeleteMapping (path="article/{id}")
    void deleteArticle(@PathVariable("id") Long id);
}
