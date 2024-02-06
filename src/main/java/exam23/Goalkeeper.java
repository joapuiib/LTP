package exam23;

public class Goalkeeper extends Player implements Timeout {
    private int goals;
    private int total;
    private int timeouts;

    public Goalkeeper(String name, int num, int born) {
        super(name, num, born);
    }

    @Override
    public boolean canPlay(String category){
        if (category.equals("A"))
            return born < 2013;
        if (category.equals("B"))
            return born > 2011;
        return false;
    }

    public void askTimeout(){
        timeouts++;
    }
}
