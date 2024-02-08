package practica1;

public class FigureGroupUse {
    public static void main(String[] args) {
        FigureGroup g = new FigureGroup();
        g.add(new Circle(10, 5, 3.5));
        g.add(new Triangle(10, 5, 6.5, 32));
        g.add(new Rectangle(10, 5, 10, 2));
        g.add(new Square(10, 5, 7));
        System.out.println(g);

        System.out.println("Area total: " + g.area());
        Figure greatest = g.greatestFigure();

        System.out.println("Greatest figure:");
        System.out.println(greatest.toString());

        g.print('a');
    }
}
