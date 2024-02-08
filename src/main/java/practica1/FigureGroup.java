package practica1;

import practica3.Printable;

import java.util.ArrayList;
import java.util.List;

public class FigureGroup implements Printable {
    private static final int NUM_FIGURES = 10; // constante
    private Figure[] figuresList = new Figure[NUM_FIGURES];
    private int numF = 0;

    public boolean add(Figure f) {
        if (!found(f) && numF < NUM_FIGURES) {
            figuresList[numF++] = f;
            return true;
        }
        return false;
    }

    public double area() {
        double a = 0;
        for(int i = 0; i < numF; i++)
            a += figuresList[i].area();
        return a;
    }

    public Figure greatestFigure(){
        double maxArea = 0;
        Figure maxFigure = null;

        for (int i = 0; i < numF; i++) {
            double area = figuresList[i].area();
            if (maxArea < area) {
                maxArea = area;
                maxFigure = figuresList[i];
            }
        }

        return maxFigure;
    }

    public String toString() {
        String s = "";
        for(int i = 0; i < numF; i++)
            s += "\n" + figuresList[i].toString();
        return s;
    }

    private boolean found(Figure f) {
        for(int i = 0; i < numF; i++) {
            if (figuresList[i].equals(f)) return true;
        }
        return false;
    }
    private boolean included(FigureGroup g) {
        for(int i = 0; i < g.numF; i++) {
            if (!found(g.figuresList[i])) return false;
        }
        return true;
    }

    public boolean equals(Object o) {
        if (!(o instanceof FigureGroup)) { return false; }
        FigureGroup g = (FigureGroup) o;
        return included(g) && g.included(this);
    }

    public List<Figure> orderedList(){
        List<Figure> orderedList = new ArrayList<Figure>();

        for (int i = 0; i < numF; i++) {
            Figure f = figuresList[i];
            int j;
            for (j = 0; j < orderedList.size(); j++) {
                if(f.compareTo(orderedList.get(j)) < 0) {
                    break;
                }
            }
            orderedList.add(j, f);
        }
        return orderedList;
    }

    @Override
    public void print(char c){
        for (int i = 0; i < numF; i++) {
            Figure f = figuresList[i];
            if(f instanceof Printable){
                Printable p = (Printable) f;
                p.print(c);
            }
        }
    }

    public static void main(String[] args) {
        FigureGroup g = new FigureGroup();
        g.add(new Circle(1.0, 6.0, 6.0));
        g.add(new Rectangle(2.0, 5.0, 10.0, 12.0));
        g.add(new Triangle(3.0, 4.0, 10.0, 2.0));
        g.add(new Circle(4.0, 3.0, 1.0));
        g.add(new Triangle(5.0, 1.0, 1.0, 2.0));
        g.add(new Square(6.0, 7.0, 15));
        g.add(new Rectangle(7.0, 2.0, 1.0, 3.0));
        System.out.println(g.orderedList());
    }
}

