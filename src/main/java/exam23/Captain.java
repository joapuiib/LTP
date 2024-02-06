package exam23;

public class Captain extends FieldPlayer implements Timeout {
    private int timeouts;

    public Captain(String name, int num, int born) {
        super(name, num, born);
        this.timeouts = 0;
    }

    public void askTimeout(){
        timeouts++;
    }
}
