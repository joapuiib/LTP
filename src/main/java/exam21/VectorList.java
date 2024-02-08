package exam21;

import java.util.ArrayList;
import java.util.List;

public class VectorList<T> implements Vector<T> {
    private List<T> list = new ArrayList<>();

    // Metodos de Coleccion
    public void add(T e) {
        list.add(e);
    }
    public T remove() {
        return list.remove(list.size() - 1);
    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public boolean isGreater(Coleccion<T> c) {
        return list.size() > c.size();
    }
    public String toString() {
        return list.toString();
    }
    public boolean pertenece(T e){
        // return list.contains(e);
        for (T e2 : list){
            if (e.equals(e2))
                return true;
        }
        return false;
    }

    // Metodos de Vector
    public void addPos(int i, T e) {
        list.add(i, e);
    }
    public T removePos(int i) {
        return list.remove(i);
    }
    public T getPos(int i) {
        return list.get(i);
    }
}
