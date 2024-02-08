package exam21;

public class FiguresPila<T extends Figure> extends PilaList<T> {
    double getXcima(){
        return cima().getX();
    }
}
