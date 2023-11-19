package hu.me.iit.distributedsystems.openfeignclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ComplexController {
    private final static int BIG_BOOK_PAGE_THRESHOLD = 100;
    private final ArticlesClient articlesClient;

    @GetMapping("find-all-big-book")
    List<ArticleDto> findAllBigBook() {
        return articlesClient.allArticles().stream()
                .filter(article -> article.getPages() > BIG_BOOK_PAGE_THRESHOLD)
                .toList();
    }
}
