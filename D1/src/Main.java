public class Main {
    public static void main(String[] args) {
        Heizung taska = new Heizung(20,10);

        Heizung taskb = new Heizung(15,10,30);




        int max = 40;
        int min = 10;
        int temperatur = 30;


        Heizung taskc = new Heizung();



        taskc.setTemperatur(temperatur);
        taskc.setMax(max);
        taskc.setMin(min);
        taskc.setIncrement(3);
    }
}