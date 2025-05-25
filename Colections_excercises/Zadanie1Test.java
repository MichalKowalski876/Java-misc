//import org.junit.jupiter.api.Test;
//import java.util.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class Zadanie1Test {
//
//    @Test
//    public void testFiltrujeKrotszeNiz4Znaki() {
//        List<String> input = Arrays.asList("Ola", "Jan", "Anna", "Ewa", "Kuba");
//        List<String> result = Zadania.przefiltrujImiona(input);
//
//        assertFalse(result.contains("JAN"));
//        assertFalse(result.contains("EWA"));
//        assertTrue(result.contains("ANNA"));
//        assertTrue(result.contains("KUBA"));
//    }
//
//    @Test
//    public void testZamieniaNaWielkieLitery() {
//        List<String> input = Arrays.asList("Kasia", "Marek");
//        List<String> result = Zadania.przefiltrujImiona(input);
//
//        assertTrue(result.contains("KASIA"));
//        assertTrue(result.contains("MAREK"));
//        assertFalse(result.contains("kasia"));
//    }
//
//    @Test
//    public void testSortowanie() {
//        List<String> input = Arrays.asList("Marek", "Zosia", "Ania");
//        List<String> result = Zadania.przefiltrujImiona(input);
//
//        List<String> expected = Arrays.asList("ANIA", "MAREK", "ZOSIA");
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testPustaLista() {
//        List<String> input = new ArrayList<>();
//        List<String> result = Zadania.przefiltrujImiona(input);
//
//        assertNotNull(result);
//        assertTrue(result.isEmpty());
//    }
//}
