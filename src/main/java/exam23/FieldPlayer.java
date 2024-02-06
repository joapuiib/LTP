package exam23;

public class FieldPlayer extends Player {

    public FieldPlayer(String name, int num, int born) {
        super(name, num, born);
    }

    @Override
    public boolean canPlay(String category){
        if (category.equals("B"))
            return born > 2011;
        if (category.equals("A"))
            return born < 2014;
        return false;
    }
}
