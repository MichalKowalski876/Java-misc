package Colections_excercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CinemaTest {

    @Test
    public void testSilneHaslo() {
        String haslo = "A1!bcde";
        assertTrue(Zadania.passWordAnalyzation(haslo));
    }

    @Test
    public void testZaMaloUnikalnychZnakow() {
        String haslo = "A1!A1!";
        assertFalse(Zadania.passWordAnalyzation(haslo)); // tylko 3 unikalne znaki
    }

    @Test
    public void testBrakWielkiejLitery() {
        String haslo = "abc123!";
        assertFalse(Zadania.passWordAnalyzation(haslo));
    }

    @Test
    public void testBrakCyfry() {
        String haslo = "Abcdef!";
        assertFalse(Zadania.passWordAnalyzation(haslo));
    }

    @Test
    public void testBrakZnakuSpecjalnego() {
        String haslo = "Abc1234";
        assertFalse(Zadania.passWordAnalyzation(haslo));
    }

    @Test
    public void testIdealneHasloZDlugoscia() {
        String haslo = "X9!aBb2";
        assertTrue(Zadania.passWordAnalyzation(haslo));
    }
}