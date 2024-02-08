package exam23o;

public class Gift extends Article {
    private String name;

    public Gift(String id, double priceCost, String name) {
        super(id);
        super.setPriceCost(priceCost);
        priceBeforeTax = 0;
        this.name = name;
    }

    @Override
    public double getOffer() {
        return 0;
    }
}
