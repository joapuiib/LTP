package exercicis.genericitat.operable;

public class ListaOperableUse {
    public static void main(String[] args) {
        ListaOperable<MyInteger> l = new ListaOperable<>();
        l.add(new MyInteger(1));
        l.add(new MyInteger(2));
        l.add(new MyInteger(3));
        l.add(new MyInteger(10));

        MyInteger suma = l.suma();
        System.out.println("Suma total: " + suma.getValue());

        ListaOperable<MyString> listaString = new ListaOperable<>();
        listaString.add(new MyString("a"));
        listaString.add(new MyString("b"));
        listaString.add(new MyString("c"));
        listaString.add(new MyString("d"));

        MyString sumaString = listaString.suma();
        System.out.println("Suma total strings: " + sumaString.getValue());
    }
}
