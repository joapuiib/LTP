package exam23;

public abstract class Player {
    private String name;
    private int num;
    protected int born;

    public Player(String name, int num, int born) {
        this.name = name;
        this.num = num;
        this.born = born;
    }

    public abstract boolean canPlay(String category);
}
