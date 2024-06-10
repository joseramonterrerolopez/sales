package local.jterrero.sales.article.infrastructure.out.mapper;

import local.jterrero.sales.article.domain.Article;
import local.jterrero.sales.article.domain.valueobject.ArticleId;
import local.jterrero.sales.article.domain.valueobject.Name;
import local.jterrero.sales.shared.infrastruture.dao.articlecore.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public final class ArticleDTOMapper {

    public List<Article> toDomain(Iterable<ArticleDTO> articleDTOIterable)
    {
        return StreamSupport
            .stream(articleDTOIterable.spliterator(), false)
            .toList()
            .stream()
            .map(articleDTO -> Article.of(
                ArticleId.of(articleDTO.getId()),
                Name.of(articleDTO.getName())
            ))
            .toList();
    }
}
