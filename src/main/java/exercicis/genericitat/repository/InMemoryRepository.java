package exercicis.genericitat.repository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository<T extends Entity> implements Repository<T> {
    private final List<T> inMemoryList;

    public InMemoryRepository() {
        this.inMemoryList = new ArrayList<>();
    }

    public void insert(T el){
        inMemoryList.add(el);
    }

    public T select(int id){
        for(T el : inMemoryList){
            if (el.getId() == id)
                return el;
        }
        return null;
    }

    public T update(T el){
        T old = null;
        for (int i = 0; i < inMemoryList.size(); i++) {
            T c = inMemoryList.get(i);
            if (c.getId() == el.getId()){
                old = c;
                inMemoryList.set(i, el);
            }
        }
        return old;
    }

    public T delete(int id){
        T old = null;
        for(T el : inMemoryList){
            if (el.getId() == id) {
                old = el;
                break;
            }
        }
        inMemoryList.remove(old);
        return old;
    }

    @Override
    public String toString(){
        return inMemoryList.toString();
    }
}
