package practica1;

public class Square extends Rectangle {
    public Square(double x, double y, double s) {
        super(x, y, s, s);
    }

    public String toString() {
        return "Square:\n\t" + super.toString();
    }

    public boolean equals(Object o) {
        if (!(o instanceof Square)) { return false; }
        Square s = (Square) o;
        return super.equals(s);
    }
}
