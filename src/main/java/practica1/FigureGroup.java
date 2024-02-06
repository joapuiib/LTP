package practica1;

public class FigureGroup {
    private static final int NUM_FIGURES = 10; // constante
    private Figure[] figuresList = new Figure[NUM_FIGURES];
    private int numF = 0;
    public void add(Figure f) {
        if (!found(f) && numF < NUM_FIGURES)
            figuresList[numF++] = f;
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
}

