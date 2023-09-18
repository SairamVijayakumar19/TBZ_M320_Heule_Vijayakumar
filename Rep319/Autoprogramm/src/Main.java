import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = new Auto();

        System.out.println("Willkommen zum Auto-Programm!");
        while (true) {
            System.out.println("\nWas möchten Sie tun?");
            System.out.println("1. Auto starten");
            System.out.println("2. Auto stoppen");
            System.out.println("3. Programm beenden");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    auto.starten();
                    break;
                case 2:
                    auto.stoppen();
                    break;
                case 3:
                    System.out.println("Programm wird beendet.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie eine gültige Option.");
            }
        }
    }
}