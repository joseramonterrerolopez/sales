package local.jterrero.sales.article.domain;

import local.jterrero.sales.article.domain.valueobject.ArticleId;
import local.jterrero.sales.article.domain.valueobject.Name;

import java.util.Objects;

public final class Article {
    private final ArticleId articleId;
    private final Name name;
    private Article(ArticleId articleId, Name name)
    {
        this.articleId = articleId;
        this.name = name;
    }
    public static Article of(ArticleId articleId, Name name)
    {
        return new Article(articleId, name);
    }
    public ArticleId articleId() {
        return articleId;
    }
    public Name name() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(articleId.value(), article.articleId.value()) && Objects.equals(name.value(), article.name.value());
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId.value(), name.value());
    }
}
