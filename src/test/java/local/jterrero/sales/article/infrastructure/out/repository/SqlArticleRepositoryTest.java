package local.jterrero.sales.article.infrastructure.out.repository;

import local.jterrero.sales.article.domain.Article;
import local.jterrero.sales.article.infrastructure.out.mapper.ArticleDTOMapper;
import local.jterrero.sales.shared.infrastruture.dao.articlecore.ArticleDTO;
import local.jterrero.sales.shared.infrastruture.dao.articlecore.SqlArticleCoreDAO;
import local.jterrero.sales.shared.test.motherobject.ArticleDTOMother;
import local.jterrero.sales.shared.test.motherobject.ArticleMother;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public final class SqlArticleRepositoryTest {
    @Mock
    private SqlArticleCoreDAO dao;
    @Mock
    private ArticleDTOMapper mapper;
    @InjectMocks
    private SqlArticleRepository repository;
    @Test
    public void orchestrate_correctly_given_no_articles()
    {
        // Given
        List<Article> emptyArticleList = givenNoArticles();
        Iterable<ArticleDTO> emptyArticleDTOIterable = givenNoArticleDTOs();

        // When
        when(dao.findAll()).thenReturn(emptyArticleDTOIterable);
        when(mapper.toDomain(emptyArticleDTOIterable)).thenReturn(emptyArticleList);
        List<Article> result = repository.searchAll();

        // Then
        thenAgentsAreCalledCorrectly(emptyArticleDTOIterable);
        thenOutputIsEmpty(result);
    }
    private List<Article> givenNoArticles()
    {
        return ArticleMother.empty();
    }
    private Iterable<ArticleDTO> givenNoArticleDTOs()
    {
        return ArticleDTOMother.empty();
    }
    private void thenAgentsAreCalledCorrectly(Iterable<ArticleDTO> articleIterable)
    {
        InOrder inOrder = inOrder(dao, mapper);
        inOrder.verify(dao, times(1)).findAll();
        inOrder.verify(mapper, times(1)).toDomain(articleIterable);
    }
    private void thenOutputIsEmpty(List<Article> articleList)
    {
        Assertions.assertThat(articleList).isEmpty();
    }
}
