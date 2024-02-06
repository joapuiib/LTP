package exam24;

public class Painting extends Artwork {
    private String style;

    public Painting(String ref, String author, String title, double value, String style) {
        super(ref, author, title, value);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public boolean restoreArtwork() {
        double newValue = this.getValue() * 1.2;
        this.setValue(newValue);
        return true;
    }
}
