package Colections_excercises;

import java.util.*;

public class Zadania {
    public static List<String> przefiltrujImiona(List<String> imiona) {
        List<String> wynik = new ArrayList<>();

        for (int i = 0; i < imiona.size(); i++) {
            if (imiona.get(i).length() >= 4) {
                wynik.add(imiona.get(i).toUpperCase());
            }
        }

        Collections.sort(wynik);

        return wynik;
    }

    public static boolean passWordAnalyzation(String passWord) {
        List<Character> rozneZnaki = new ArrayList<>();

        boolean czyLiczba = false;
        boolean CzyDuzaLitera = false;
        boolean CzyZnakSpecjalny = false;

        for (int i = 0; i < passWord.length(); i++) {
            if (!rozneZnaki.contains(passWord.charAt(i))) {
                rozneZnaki.add(passWord.charAt(i));
            }
        }
        for (int i = 0; i < rozneZnaki.size(); i++) {
            char znak = rozneZnaki.get(i);

            if (Character.isDigit(znak)) {
                czyLiczba = true;
            }
            if (Character.isUpperCase(znak)) {
                CzyDuzaLitera = true;
            }
            if (!Character.isLetterOrDigit(znak)) {
                CzyZnakSpecjalny = true;
            }

        }

        boolean czySilne = rozneZnaki.size() >= 6 && czyLiczba && CzyDuzaLitera && CzyZnakSpecjalny;

        if (czySilne) {
            System.out.println("Hasło jest wystarczająco silne.");
        } else {
            System.out.println("Hasło musi spełniać następujące wymagania:");
            if (rozneZnaki.size() < 6) {
                System.out.println("- Hasło musi zawierać przynajmniej 6 unikalnych znaków.");
            }
            if (!czyLiczba) {
                System.out.println("- Hasło musi zawierać przynajmniej jedną cyfrę.");
            }
            if (!CzyDuzaLitera) {
                System.out.println("- Hasło musi zawierać przynajmniej jedną wielką literę.");
            }
            if (!CzyZnakSpecjalny) {
                System.out.println("- Hasło musi zawierać przynajmniej jeden znak specjalny.");
            }
        }

        return czySilne;
    }
}