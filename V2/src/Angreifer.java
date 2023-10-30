public class Angreifer extends Spieler{
    public Angreifer(String name) {
        super(name);
    }

    public void jogTraining(){
        System.out.println("Doing Jog Training...");
    }

    @Override
    public void spielen() {
        System.out.println("Angreifer spielt...");
    }
}
