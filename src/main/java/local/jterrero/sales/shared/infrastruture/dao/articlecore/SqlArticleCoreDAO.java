package local.jterrero.sales.shared.infrastruture.dao.articlecore;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SqlArticleCoreDAO extends CrudRepository<ArticleDTO, UUID> {
}
