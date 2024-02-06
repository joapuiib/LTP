package exam24;

public class Sculpture extends Artwork {
    public static int STONE = 0;
    public static int CLAY = 1;
    public static int OTHER = 2;

    private int material;

    public Sculpture(String ref, String author, String title, double value, int m) {
        super(ref, author, title, value);
        this.material = (m == STONE || m == CLAY) ? m : OTHER;
    }

    public int getMaterial() {
        return material;
    }

    @Override
    public int compareTo(Artwork a) {
        if (a instanceof Sculpture){
            Sculpture s = (Sculpture) a;
            if (this.getTitle().equals(s.getTitle())
                    && this.getAuthor().equals(s.getAuthor())
                    && this.material == s.material
            ) {
                return 0;
            }
        }
        return super.compareTo(a);
    }

    @Override
    public boolean restoreArtwork() {
        if (material == STONE || material == CLAY){
            double newValue = this.getValue() * 1.1;
            this.setValue(newValue);
            return true;
        }
        return false;
    }
}
