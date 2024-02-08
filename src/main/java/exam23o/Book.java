package exam23o;

public class Book extends Article implements Sellable {
    private static final double tax = 0.4;
    private String title;
    private String author;

    public Book(String id, double priceCost, String title, String author) {
        super(id);
        super.setPriceCost(priceCost);
        priceBeforeTax = 1.1 * priceCost;
        this.title = title;
        this.author = author;
    }

    @Override
    public double getPriceAfterTax() {
        return priceBeforeTax * (1 + tax);
    }

    @Override
    public double getOffer() {
        return getPriceAfterTax() * 0.7;
    }
}
