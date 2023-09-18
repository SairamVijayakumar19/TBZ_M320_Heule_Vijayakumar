public class Auto {
    private boolean gestartet;

    public Auto() {
        this.gestartet = false;
    }

    public void starten() {
        if (!gestartet) {
            gestartet = true;
            System.out.println("Das Auto wurde gestartet.");
        } else {
            System.out.println("Das Auto ist bereits gestartet.");
        }
    }

    public void stoppen() {
        if (gestartet) {
            gestartet = false;
            System.out.println("Das Auto wurde gestoppt.");
        } else {
            System.out.println("Das Auto ist bereits gestoppt.");
        }
    }
}
