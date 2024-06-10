package local.jterrero.sales.shared.domain;

public abstract class ValueObject<E> {
    private final E value;
    protected ValueObject(E value)
    {
        this.value = value;
        isNotNull(value);
    }

    public E value()
    {
        return value;
    }

    private void isNotNull(E value)
    {
        if (value == null) {
            throw new IllegalArgumentException(getClass().getName() + " cannot be null");
        }
    }
}
