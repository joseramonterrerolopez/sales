package local.jterrero.sales.article.domain.valueobject;

import local.jterrero.sales.shared.domain.ValueObject;

import java.util.UUID;

public final class ArticleId extends ValueObject<UUID> {
    private ArticleId(UUID articleId) {
        super(articleId);
    }

    public static ArticleId of(UUID articleId)
    {
        return new ArticleId(articleId);
    }
}
