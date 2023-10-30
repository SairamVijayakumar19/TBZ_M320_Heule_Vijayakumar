public class Goalie extends Spieler{
    double koerperGroesse;

    public Goalie(String name, double koerperGroesse) {
        super(name);
        this.koerperGroesse = koerperGroesse;
    }

    @Override
    public void spielen() {
        System.out.println("Goalie spielt...");
    }
}
