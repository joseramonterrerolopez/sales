package local.jterrero.sales.article.infrastructure.in.mapper;

import local.jterrero.sales.article.domain.Article;
import local.jterrero.sales.article.infrastructure.in.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ControllerArticleDTOMapper")
public final class ArticleDTOMapper {

    public List<ArticleDTO> from(List<Article> articleList)
    {
        return articleList
                .stream()
                .map(article -> ArticleDTO.of(
                        article.articleId().value(),
                        article.name().value()
                ))
                .toList();
    }
}
