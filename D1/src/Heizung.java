public class Heizung {
private int temperatur;
private int min;
private int max;
private int increment;

    public Heizung(int temperatur, int min, int max) {
        this.temperatur = temperatur;
        this.min = min;
        this.max = max;
    }

    public Heizung(int temperatur, int increment){
        this.temperatur = temperatur;
        this.increment = increment;
    }

    public Heizung(){

    }


    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public void increaseTemp(int min, int increment){
        min = temperatur;
        temperatur = min + increment;
    }

    public void decreaseTemp(int min, int increment){
        max = temperatur;
        temperatur = max - increment;
    }


}
