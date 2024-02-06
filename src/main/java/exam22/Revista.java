package exam22;

public class Revista extends Publicacion {
    protected int numero;

    public Revista(String codigo, String titulo, int anyoPublicacion, int numero) {
        super(codigo, titulo, anyoPublicacion);
        this.numero = numero;
    }
}
