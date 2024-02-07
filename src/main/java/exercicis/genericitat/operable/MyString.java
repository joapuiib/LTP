package exercicis.genericitat.operable;

public class MyString extends Envoltorio<String> implements Operable<MyString> {
    public MyString(String value) {
        super(value);
    }

    @Override
    public MyString suma(MyString other){
        return new MyString(this.value + " + " + other.value);
    }

    @Override
    public MyString resta(MyString other){
        return new MyString(this.value + " - " + other.value);
    }

    @Override
    public MyString producto(MyString other){
        return new MyString(this.value + " * " + other.value);
    }

    @Override
    public MyString division(MyString other){
        return new MyString(this.value + " / " + other.value);
    }
}
