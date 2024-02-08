package exam23o;

import java.util.ArrayList;
import java.util.List;

public class ShopCart<T extends Sellable> {
    private List<T> items;
    private double total;

    public ShopCart() {
        this.items = new ArrayList<>();
    }
    public double getTotal() {
        return total;
    }
    private void updateAmount(double amount) {
        total += amount;
    }

    public void addCart(T el){
        items.add(el);
        double price = el.getPriceAfterTax();
        updateAmount(price);
    }
}
