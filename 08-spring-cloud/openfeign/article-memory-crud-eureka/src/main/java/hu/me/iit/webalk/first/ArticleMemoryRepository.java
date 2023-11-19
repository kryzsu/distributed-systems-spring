package hu.me.iit.webalk.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArticleMemoryRepository implements ArticleRepository {
    private final List<ArticleDto> articles = new ArrayList<>();

    public int findArticleById(Long id) {
        int found = -1;
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getId().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public List<ArticleDto> findAll() {
        return articles;
    }

    @Override
    public ArticleDto getById(Long id) {
        int articleByIdIndex = findArticleById(id);

        return articleByIdIndex == -1 ? null : articles.get(articleByIdIndex);
    }

    @Override
    public Long save(ArticleDto articleDto) {
        int found = findArticleById(articleDto.getId());

        if (found != -1) {
            ArticleDto foundArticle = articles.get(found);
            foundArticle.setAuthor(articleDto.getAuthor());
            foundArticle.setPages(articleDto.getPages());
            foundArticle.setTitle(articleDto.getTitle());
        } else {
            articles.add(articleDto);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findArticleById(id);

        if (found != -1) {
            articles.remove(found);
        }
    }
}
