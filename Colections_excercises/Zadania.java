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
        boolean znakSpecjalny = false;

        for (int i = 0; i < passWord.length(); i++) {
            char c = passWord.charAt(i);

            if (Character.isDigit(c)) {
                czyLiczba = true;
            }

            if (Character.isUpperCase(c)) {
                CzyDuzaLitera = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                znakSpecjalny = true;
            }

            if (!rozneZnaki.contains(c)) {
                rozneZnaki.add(c);
            }
        }

        boolean isStrong = rozneZnaki.size() >= 6 && czyLiczba && CzyDuzaLitera && znakSpecjalny;

        if (isStrong) {
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
            if (!znakSpecjalny) {
                System.out.println("- Hasło musi zawierać przynajmniej jeden znak specjalny.");
            }
        }

        return isStrong;
    }
}