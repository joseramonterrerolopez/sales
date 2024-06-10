package local.jterrero.sales.article.infrastructure.in.controller;

import local.jterrero.sales.article.application.SearchAll;
import local.jterrero.sales.article.domain.Article;
import local.jterrero.sales.article.infrastructure.in.ArticleDTO;
import local.jterrero.sales.article.infrastructure.in.mapper.ArticleDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public final class GetArticles {
    private final SearchAll searchAll;
    private final ArticleDTOMapper dtoMapper;
    public GetArticles(SearchAll searchAll, ArticleDTOMapper dtoMapper)
    {
        this.searchAll = searchAll;
        this.dtoMapper = dtoMapper;
    }
    @GetMapping("/api/v1/articles")
    public ResponseEntity<List<ArticleDTO>> handle()
    {
        List<Article> articleList = searchAll.handle();
        return ResponseEntity.ok(dtoMapper.from(articleList));
    }
}
