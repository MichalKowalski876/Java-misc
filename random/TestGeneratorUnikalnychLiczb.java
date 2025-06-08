package random;

import org.junit.jupiter.api.Test;
import random.Zadania;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TestGeneratorUnikalnychLiczb {

    @Test
    void testPoprawnaIloscUnikalnychLiczb() {
        Set<Integer> wynik = Zadania.wygenerujUnikalneLiczby(5, 10, 20);
        assertEquals(5, wynik.size());
    }

    @Test
    void testZakresLiczbPoprawny() {
        Set<Integer> wynik = Zadania.wygenerujUnikalneLiczby(10, 100, 200);
        assertTrue(wynik.stream().allMatch(i -> i >= 100 && i < 200));
    }

    @Test
    void testZbytWysokaIloscZwracaPustySet() {
        Set<Integer> wynik = Zadania.wygenerujUnikalneLiczby(15, 1, 10);
        assertTrue(wynik.isEmpty());
    }

    @Test
    void testNiepoprawnyZakresZwracaPustySet() {
        Set<Integer> wynik = Zadania.wygenerujUnikalneLiczby(5, 20, 10);
        assertTrue(wynik.isEmpty());
    }

}
