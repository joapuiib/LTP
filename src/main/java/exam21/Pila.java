package exam21;

public interface Pila<T> extends Coleccion<T> {
    T cima();
    T desapilar();
}
