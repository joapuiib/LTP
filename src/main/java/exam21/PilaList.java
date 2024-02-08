package exam21;

public class PilaList<T> extends VectorList<T> implements Pila<T> {
    @Override
    public T cima(){
        int ultim = size() - 1;
        return getPos(ultim);
    }

    @Override
    public T desapilar(){
        return remove();
    }
}
