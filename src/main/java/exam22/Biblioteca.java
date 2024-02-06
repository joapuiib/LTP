package exam22;

public class Biblioteca {
    public static int cuentaPrestados(Object[] objs){
        int cont = 0;
        for(Object o : objs){
            if (o instanceof Prestable){
                Prestable p = (Prestable) o;
                if (p.prestado())
                    cont++;
            }
        }
        return cont;
    }

    public static int publicacionesAnterioresA(Publicacion[] publicaciones, int anyo){
        int cont = 0;
        for (Publicacion p : publicaciones){
            if (p.getAnyoPublicacion() < anyo)
                cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        Publicacion[] publicaciones = new Publicacion[4];

        Libro l2 = new Libro("2", "Libro 2", 2001);
        l2.prestar();

        publicaciones[0] = new Libro("1", "Libro 1", 1979);
        publicaciones[1] = l2;
        publicaciones[2] = new Revista("3", "Revista 1", 2002, 1);
        publicaciones[3] = new Revista("4", "Revista 1", 2003, 2);

        for (Publicacion p : publicaciones)
            System.out.println(p.toString());

        System.out.println("Publicaciones prestadas: " + cuentaPrestados(publicaciones));
        System.out.println("Publicaciones anteriores a 1990: " + publicacionesAnterioresA(publicaciones, 1990));
    }
}
