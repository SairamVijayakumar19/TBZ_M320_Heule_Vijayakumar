import java.util.ArrayList;
import java.util.List;

public class Flug {
    List<Passagier> passagiere = new ArrayList<>();

    void passagierListAusgeben(){
        for (Passagier p : passagiere) p.nameAusgeben();
    }

    void addPassagier(Passagier p){
        passagiere.add(p);
    }

    public List<Passagier> getPassagiere() {
        return passagiere;
    }

    void removePassagier(Passagier p){
        passagiere.remove(p);
    }
}
