import java.util.ArrayList;
import java.util.List;

public class Mannschaft {
    public List<Spieler> getMannschaft() {
        return mannschaft;
    }

    private List<Spieler> mannschaft = new ArrayList<>();

    public void addPlayer(Spieler spieler){
        mannschaft.add(spieler);
    }

    public void removePlayer(Spieler spieler){
        mannschaft.remove(spieler);
    }

    public void printTeam(){
        for (Spieler s : mannschaft){
            System.out.printf(s.name + " -> ");
            System.out.println(s.getClass().getSimpleName());
        }
    }
}
