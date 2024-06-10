package local.jterrero.sales.article.domain.valueobject;

import local.jterrero.sales.shared.domain.ValueObject;

public final class Name extends ValueObject<String> {
    private Name(String value) {
        super(value);
    }
    public static Name of(String name)
    {
        return new Name(name);
    }
}
