package random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnalizatorTablicyTest {

    int[] testowaTablica = {4, 7, 2, 9, 1, 6};

    @Test
    public void testZnajdzMax() {
        assertEquals(9, AnalizatorTablicy.znajdzMax(testowaTablica));
    }

    @Test
    public void testZnajdzMin() {
        assertEquals(1, AnalizatorTablicy.znajdzMin(testowaTablica));
    }

    @Test
    public void testPoliczParzyste() {
        assertEquals(3, AnalizatorTablicy.policzParzyste(testowaTablica));
    }

    @Test
    public void testSumaElementow() {
        assertEquals(29, AnalizatorTablicy.sumaElementow(testowaTablica));
    }
}
