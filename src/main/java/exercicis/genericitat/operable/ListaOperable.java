package exercicis.genericitat.operable;

import java.util.ArrayList;
import java.util.List;

public class ListaOperable<T extends Operable<T>> {
    private final List<T> list;

    public ListaOperable() {
        this.list = new ArrayList<>();
    }

    public void add(T el){
        list.add(el);
    }

    public T suma(){
        if (list.isEmpty())
            return null;

        T sumaActual = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T el = list.get(i);
            sumaActual = sumaActual.suma(el);
        }
        return sumaActual;
    }
}
