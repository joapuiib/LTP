package practica1;

import practica3.ComparableRange;
import practica3.Printable;

public class Rectangle extends Figure implements ComparableRange<Figure>, Printable {
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

    @Override
    public int compareToRange(Figure r) {
        if (r instanceof Rectangle) {
            double diff = Math.abs(this.area() - r.area());
            double sum = this.area() + r.area();
            if (diff <= sum * 0.1)
                return 0;
        }

        return super.compareTo(r);
    }

    public void print(char c){
        int b = (int) width;
        int h = (int) height;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
