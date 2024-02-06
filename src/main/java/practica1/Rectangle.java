package practica1;

public class Rectangle extends Figure {
    private double width, height;
    public Rectangle(double x, double y, double w, double h) {
        super(x, y);
        width = w;
        height = h;
    }

    public String toString() {
        return "Rectangle:\n\t" + super.toString() + "\n\tWidth: " + width + "\n\tHeight: " + height;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) { return false; }
        Rectangle r = (Rectangle) o;
        return super.equals(r) && width == r.width && height == r.height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
