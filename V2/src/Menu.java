import java.util.Scanner;

public class Menu {
    private Mannschaft fcBarcelona = new Mannschaft();
    private Scanner sc = new Scanner(System.in);

    public void run() {

        int choice = 1;

        while (choice != 0) {

            System.out.println("FC Barcelona Manager");
            System.out.println("****************************");
            System.out.println("0 - Verlassen");
            System.out.println("1 - Spieler hinzufügen");
            System.out.println("2 - Goalie hinzufügen");
            System.out.println("3 - Angreifer hinzufügen");
            System.out.println("4 - Verteidiger hinzufügen");
            System.out.println("5 - Spieler entfernen");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    fcBarcelona.addPlayer(new Spieler(definePlayerName()));
                    fcBarcelona.printTeam();
                }
                case 2 -> {
                    fcBarcelona.addPlayer(new Goalie(definePlayerName(), definePlayerHeight()));
                    fcBarcelona.printTeam();
                }
                case 3 -> {
                    fcBarcelona.addPlayer(new Angreifer(definePlayerName()));
                    fcBarcelona.printTeam();
                }
                case 4 -> {
                    fcBarcelona.addPlayer(new Verteidiger(definePlayerName()));
                    fcBarcelona.printTeam();
                }
                case 5 -> {
                    String nameOfPlayer = definePlayerName();
                    fcBarcelona.getMannschaft().removeIf(p -> p.name.equals(nameOfPlayer));
                    fcBarcelona.printTeam();
                }
            }
        }
    }

    public String definePlayerName(){
        sc.nextLine();
        System.out.println("Was ist der name des Spielers?");
        return sc.nextLine();
    }

    public double definePlayerHeight(){
        System.out.println("Wie gross ist der Spieler?");
        return sc.nextDouble();
    }
}
