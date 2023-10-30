public class Spieler {
    String name;

    public Spieler(String name) {
        this.name = name;
    }

    public void zeigeName(){
        System.out.println(name);
    }

    public void spielen(){
        System.out.println("Spieler spielt...");
    }
}
