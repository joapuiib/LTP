package exercicis.genericitat.operable;

public class Envoltorio<T> {
    protected T value;

    public Envoltorio(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
