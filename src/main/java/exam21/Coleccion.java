package exam21;

public interface Coleccion<T> {
    void add(T e);
    T remove();
    int size();
    boolean isEmpty();
    boolean isGreater(Coleccion<T> c);
    String toString();
    boolean pertenece(T e);
}
