package exam22;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;
    public Libro(String codigo, String titulo, int anyoPublicacion) {
        super(codigo, titulo, anyoPublicacion);
        prestado = false;
    }

    @Override
    public void prestar(){
        prestado = true;
    }
    @Override
    public void devolver(){
        prestado = false;
    }
    @Override
    public boolean prestado(){
        return prestado;
    }
}
