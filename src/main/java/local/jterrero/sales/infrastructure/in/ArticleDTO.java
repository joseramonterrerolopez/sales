package local.jterrero.sales.infrastructure.in;

import java.io.Serializable;

public final class ArticleDTO implements Serializable {
    private final String name;

    private ArticleDTO(String name)
    {
        this.name = name;
    }

    public static ArticleDTO of(String name)
    {
        return new ArticleDTO(name);
    }

    public String getName() {
        return name;
    }
}
