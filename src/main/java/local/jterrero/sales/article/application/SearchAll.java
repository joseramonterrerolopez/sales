package local.jterrero.sales.article.application;

import local.jterrero.sales.article.application.repository.ArticleRepository;
import local.jterrero.sales.article.domain.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchAll {
    private final ArticleRepository articleRepository;
    public SearchAll(ArticleRepository articleRepository)
    {
        this.articleRepository = articleRepository;
    }
    public List<Article> handle()
    {
        return articleRepository.searchAll();
    }
}
