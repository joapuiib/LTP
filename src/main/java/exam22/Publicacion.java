package exam22;

public class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int anyoPublicacion;

    public Publicacion(String codigo, String titulo, int anyoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }
}
