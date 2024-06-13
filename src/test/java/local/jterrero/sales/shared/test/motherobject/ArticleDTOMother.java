package local.jterrero.sales.shared.test.motherobject;

import local.jterrero.sales.shared.infrastruture.dao.articlecore.ArticleDTO;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ArticleDTOMother {
    private static final String X_UUID = "8d62f238-bf5e-4c9e-b4c0-6b1beb2adeb4";
    private static final String Y_UUID = "8a530bac-66c4-42db-8d10-8f2fd610b417";
    private static final String Z_UUID = "67b18539-fc44-4c21-a6da-341161ce33d9";
    private ArticleDTOMother() {
    }
    public static Iterable<ArticleDTO> empty() {
        return Collections.emptyList();
    }

    public static Iterable<ArticleDTO> examplesXYZ() {
        return List.of(
            exampleX(),
            exampleY(),
            exampleZ()
        );
    }
    public static ArticleDTO exampleX() {
        return new ArticleDTO(UUID.fromString(X_UUID), "x");
    }
    public static ArticleDTO exampleY() {
        return new ArticleDTO(UUID.fromString(Y_UUID), "y");
    }
    public static ArticleDTO exampleZ() {
        return new ArticleDTO(UUID.fromString(Z_UUID), "z");
    }
}
