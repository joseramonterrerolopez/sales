package local.jterrero.sales.article.application.repository;

import local.jterrero.sales.article.domain.Article;

import java.util.List;

public interface ArticleRepository {
    List<Article> searchAll();
}
