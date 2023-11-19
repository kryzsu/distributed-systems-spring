package hu.me.iit.webalk.first;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ArticleServiceImpl implements ArticleService {
    private final int MAXIMUM_ARTICLE_COUNT = 10;
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public ArticleDto getById(Long id) {
        return articleRepository.getById(id);
    }

    @Override
    public Long save(ArticleDto articleDto) {
        if (articleRepository.findAll().size() >= MAXIMUM_ARTICLE_COUNT) {
            throw new TooMuchArticleException();
        }
        return articleRepository.save(articleDto);
    }

    @Override
    public void deleteById(Long id) {
        articleRepository.deleteById(id);
    }
}
