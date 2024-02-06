package exam23;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String category;
    private int wins;
    private Goalkeeper goalkeeper;
    private List<FieldPlayer> fieldPlayers;

    public Team(String name, String category) {
        this.name = name;
        this.category = category;
        fieldPlayers = new ArrayList<>();
    }

    public boolean addPlayer(Player p){
        boolean added = false;
        if (p.canPlay(category)) {
            if (p instanceof Goalkeeper) {
                goalkeeper = (Goalkeeper) p;
                added = true;
            } else if (!fieldPlayers.contains(p)) {
                fieldPlayers.add((FieldPlayer) p);
                added = true;
            }
        }
        return added;
    }
}
