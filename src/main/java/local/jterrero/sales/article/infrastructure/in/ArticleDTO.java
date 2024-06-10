package local.jterrero.sales.article.infrastructure.in;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@AllArgsConstructor
public final class ArticleDTO implements Serializable {
    private final UUID articleId;
    private final String name;
    public static ArticleDTO of(UUID articleId, String name)
    {
        return new ArticleDTO(articleId, name);
    }
}
