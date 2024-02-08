package exam23o;

public abstract class Article {
    private String id;
    private double priceCost;
    protected double priceBeforeTax;

    public Article(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public double getPriceCost() {
        return priceCost;
    }
    public void setPriceCost(double priceCost) {
        this.priceCost = priceCost;
    }

    public abstract double getOffer();
}
