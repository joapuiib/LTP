package exam24;

public abstract class Artwork implements Comparable<Artwork>, Restorable {
    private String ref;
    private String author;
    private String title;
    private double value;

    public Artwork(String ref, String author, String title, double value) {
        this.ref = ref;
        this.author = author;
        this.title = title;
        this.value = value;
    }

    public String getRef() {
        return ref;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Artwork o) {
        if (this.title.equals(o.title) && this.author.equals(o.author))
            return 0;
        else if (this.value < o.value)
            return -1;
        else
            return 1;
    }
}
