import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flug tui = new Flug();
        Passagier p1 = new Passagier("Dominic");
        Scanner sc = new Scanner(System.in);

        tui.addPassagier(p1);
        tui.removePassagier(p1);

        int choice = 1;

        while (choice != 0) {
            System.out.println("Tui Flight Manager");
            System.out.println("************************");
            System.out.println("0 - Quit");
            System.out.println("1 - Book flight");
            System.out.println("2 - Cancel flight");


            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.println("Enter your name:");
                    String nameToAdd = sc.nextLine();
                    Passagier p2 = new Passagier(nameToAdd);
                    tui.addPassagier(p2);
                    tui.passagierListAusgeben();
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.println("Enter your name:");
                    String nameToRemove = sc.nextLine();
                    tui.getPassagiere().removeIf(p -> p.name.equals(nameToRemove));
                    tui.passagierListAusgeben();
                }
            }
        }
    }
}