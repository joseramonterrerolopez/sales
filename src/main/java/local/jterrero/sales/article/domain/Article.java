package local.jterrero.sales.article.domain;

import local.jterrero.sales.article.domain.valueobject.ArticleId;
import local.jterrero.sales.article.domain.valueobject.Name;

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
}
