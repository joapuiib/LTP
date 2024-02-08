package exercicis.interficies;

public class Botella implements Comparable<Botella> {
    private String marca;
    private double capacitat;

    public Botella(String marca, double capacitat) {
        this.marca = marca;
        this.capacitat = capacitat;
    }

    @Override
    public int compareTo(Botella o) {
        if (this.capacitat < o.capacitat) {
            return -1;
        } else if (this.capacitat > o.capacitat) {
            return 1;
        } else {
            return 0;
        }
    }
}
