package exam23o;

public class Game extends Article implements Sellable {
    private static final double tax = 0.5;
    private String title;
    private int players;

    public Game(String id, double priceCost, String title, int players) {
        super(id);
        super.setPriceCost(priceCost);
        priceBeforeTax = 1.2 * priceCost;
        this.title = title;
        this.players = players;
    }

    @Override
    public double getPriceAfterTax() {
        return priceBeforeTax * (1 + tax);
    }

    @Override
    public double getOffer() {
        return getPriceAfterTax() * 0.85;
    }
}
