package exercicis.genericitat.matriz;

public class Matriz<T> {
    private final T[][] m;
    private final int filas;
    private final int columnas;

    @SuppressWarnings("unchecked")
    public Matriz(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        m = (T[][]) new Object[filas][columnas];
    }

    public void set(int fila, int columna, T elemento){
        m[fila][columna] = elemento;
    }

    public T get(int fila, int columna){
        return m[fila][columna];
    }

    public int filas(){
        // return m.length;
        return filas;
    }

    public int columnas(){
        // return m[0].length
        return columnas;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            s.append("|");
            for (int j = 0; j < columnas; j++) {
                s.append(String.format(" %s |", m[i][j]));
            }
            s.append("\n");
        }
        return s.toString();
    }
}
