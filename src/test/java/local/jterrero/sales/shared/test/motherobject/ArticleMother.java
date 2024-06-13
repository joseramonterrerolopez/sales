package local.jterrero.sales.shared.test.motherobject;

import local.jterrero.sales.article.domain.Article;
import local.jterrero.sales.article.domain.valueobject.ArticleId;
import local.jterrero.sales.article.domain.valueobject.Name;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ArticleMother {
    private static final String X_UUID = "8d62f238-bf5e-4c9e-b4c0-6b1beb2adeb4";
    private static final String Y_UUID = "8a530bac-66c4-42db-8d10-8f2fd610b417";
    private static final String Z_UUID = "67b18539-fc44-4c21-a6da-341161ce33d9";
    private ArticleMother()
    {}
    public static List<Article> empty()
    {
        return Collections.emptyList();
    }
    public static List<Article> examplesXYZ() {
        return List.of(
                exampleX(),
                exampleY(),
                exampleZ()
        );
    }
    public static Article exampleX() {
        return Article.of(
            ArticleId.of(UUID.fromString(X_UUID)),
            Name.of("x")
        );
    }
    public static Article exampleY() {
        return Article.of(
            ArticleId.of(UUID.fromString(Y_UUID)),
            Name.of("y")
        );
    }
    public static Article exampleZ() {
        return Article.of(
            ArticleId.of(UUID.fromString(Z_UUID)),
            Name.of("z")
        );
    }
}
