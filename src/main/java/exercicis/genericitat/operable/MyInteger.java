package exercicis.genericitat.operable;

public class MyInteger extends Envoltorio<Integer> implements Operable<MyInteger> {

    public MyInteger(Integer e){
        super(e);
    }
    @Override
    public MyInteger suma(MyInteger other){
        return new MyInteger(this.value + other.value);
    }

    @Override
    public MyInteger resta(MyInteger other){
        return new MyInteger(this.value - other.value);
    }

    @Override
    public MyInteger producto(MyInteger other){
        return new MyInteger(this.value * other.value);
    }

    @Override
    public MyInteger division(MyInteger other){
        return new MyInteger(this.value / other.value);
    }
}
