package exam24;

import java.util.ArrayList;
import java.util.List;

public class Exhibition<T extends Artwork> {
    private double balance;
    private final List<T> items;
    public Exhibition(){
        balance = 0;
        items = new ArrayList<>();
    }
    public void addItem(T item){
        items.add(item);
    }

    public boolean sell(String ref, double amount){
        for (int i = 0; i < items.size(); i++) {
            T el = items.get(i);
            if (el.getRef().equals(ref)){
                items.remove(el);
                balance += amount;
                return true;
            }
        }
        return false;
    }
}