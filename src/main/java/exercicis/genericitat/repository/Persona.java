package exercicis.genericitat.repository;

public class Persona extends Entity {
    private String nombre;
    private int edat;

    public Persona(int id, String nombre, int edat) {
        super(id);
        this.nombre = nombre;
        this.edat = edat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edat=" + edat +
                '}';
    }
}
