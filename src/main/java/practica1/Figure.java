package practica1;

public abstract class Figure {
    private double x, y;
    public Figure(double x, double y) {
        this.x = x; this.y = y;
    }
    public boolean equals(Object o) {
        if (!(o instanceof Figure)) { return false; }
        Figure f = (Figure) o;
        return x == f.x && y == f.y;
    }
    public String toString() {
        return "Area: " + area() + "\n" +
                "\tPosition (" + x + ", " + y + ")";
    }

    public abstract double area();
}
