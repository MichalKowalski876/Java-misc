package random;

import org.junit.jupiter.api.Test;
import random.Zadania;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


public class TestHistogramSlow {
    @Test
    void typowyTekst() {
        String tekst = "Ala ma kota";
        Map<Integer, Integer> wynik = Zadania.histogramSlow(tekst);

        assertEquals(1, wynik.get(4));
        assertEquals(1, wynik.get(3));
        assertEquals(1, wynik.get(2));
    }

    @Test
    void pustaLinia() {
        String tekst = "";
        Map<Integer, Integer> wynik = Zadania.histogramSlow(tekst);

        assertEquals(1, wynik.get(0));  // jedno puste słowo
    }

    @Test
    void slowaRoznejDlugosci() {
        String tekst = "Ja lubię programować w Javie";
        Map<Integer, Integer> wynik = Zadania.histogramSlow(tekst);

        assertEquals(1, wynik.get(1));
        assertEquals(1, wynik.get(2));
        assertEquals(2, wynik.get(5));
        assertEquals(1, wynik.get(11));
    }
}
