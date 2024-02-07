package exercicis.genericitat.operable;

public interface Operable<T> {
    T suma(T other);
    T resta(T other);
    T producto(T other);
    T division(T other);
}
