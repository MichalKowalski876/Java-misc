package Colections_excercises;

import java.util.*;

public class Zadania {
    public static List<String> przefiltrujImiona(List<String> imiona) {
        List<String> wynik = new ArrayList<>();

        for (int i = 0; i < imiona.size(); i ++) {
            if (imiona.get(i).length() >= 4) {
                wynik.add(imiona.get(i).toUpperCase());
            }
        }

        Collections.sort(wynik);

        return wynik;
    }
}
