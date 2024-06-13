package local.jterrero.sales.article.infrastructure.out.mapper;

import local.jterrero.sales.article.domain.Article;
import local.jterrero.sales.shared.infrastruture.dao.articlecore.ArticleDTO;
import local.jterrero.sales.shared.test.motherobject.ArticleDTOMother;
import local.jterrero.sales.shared.test.motherobject.ArticleMother;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public final class ArticleDTOMapperTest {
    @InjectMocks
    private ArticleDTOMapper mapper;
    @Test
    public void to_domain_correctly_given_an_iterable_of_article_dto()
    {
        // Given
        Iterable<ArticleDTO> articleDTOIterable = givenNoArticleDTOs();

        // When
        List<Article> result = mapper.toDomain(articleDTOIterable);

        // Then
        List<Article> expected = givenNoArticles();
        Assertions.assertThat(result).isEqualTo(expected);
    }
    @Test
    public void to_domain_correctly_given_an_empty_iterable_of_article_dto()
    {
        // Given
        Iterable<ArticleDTO> articleDTOIterable = givenNoArticleDTOs();

        // When
        List<Article> result = mapper.toDomain(articleDTOIterable);

        // Then
        Assertions.assertThat(result).isEmpty();
    }
    private List<Article> givenNoArticles()
    {
        return ArticleMother.empty();
    }
    private Iterable<ArticleDTO> givenNoArticleDTOs()
    {
        return ArticleDTOMother.empty();
    }
    private Iterable<ArticleDTO> givenTheArticleDTOsXYZ()
    {
        return ArticleDTOMother.examplesXYZ();
    }
    private List<Article> givenTheArticlesXYZ()
    {
        return ArticleMother.examplesXYZ();
    }
}
