import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class HeizungTest {

    @Test
    public void testInitialTemperature() {
        Heizung heizung = new Heizung();
        assertEquals(0, heizung.getTemperatur());
    }

    @Test
    public void testTemperatureSetting() {
        Heizung heizung = new Heizung();
        heizung.setTemperatur(25);
        assertEquals(25, heizung.getTemperatur());
    }

    @Test
    public void testTemperatureIncrement() {
        Heizung heizung = new Heizung(20, 10);
        heizung.increaseTemp(heizung.getMin(), heizung.getIncrement());
        assertEquals(30, heizung.getTemperatur());
    }

    @Test
    public void testTemperatureDecrement() {
        Heizung heizung = new Heizung(30, 10);
        heizung.decreaseTemp(heizung.getMax(), heizung.getIncrement());
        assertEquals(20, heizung.getTemperatur());
    }

}
