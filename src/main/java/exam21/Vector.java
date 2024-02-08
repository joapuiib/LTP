package exam21;

public interface Vector<T> extends Coleccion<T> {
    void addPos(int i, T e);
    T removePos(int i);
    T getPos(int i);
}
