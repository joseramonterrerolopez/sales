package local.jterrero.sales.article.infrastructure.out.repository;

import local.jterrero.sales.article.application.repository.ArticleRepository;
import local.jterrero.sales.article.domain.Article;
import local.jterrero.sales.article.infrastructure.out.mapper.ArticleDTOMapper;
import local.jterrero.sales.shared.infrastruture.dao.articlecore.ArticleDTO;
import local.jterrero.sales.shared.infrastruture.dao.articlecore.SqlArticleCoreDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlArticleRepository implements ArticleRepository {
    private final SqlArticleCoreDAO sqlArticleCoreDAO;
    private final ArticleDTOMapper dtoMapper;
    public SqlArticleRepository(SqlArticleCoreDAO sqlArticleCoreDAO, ArticleDTOMapper dtoMapper)
    {
        this.sqlArticleCoreDAO = sqlArticleCoreDAO;
        this.dtoMapper = dtoMapper;
    }
    @Override
    public List<Article> searchAll() {
        Iterable<ArticleDTO> articleDTOIterable = sqlArticleCoreDAO.findAll();
        return dtoMapper.toDomain(articleDTOIterable);
    }
}
