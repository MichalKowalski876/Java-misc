package random;

public class AnalizatorTablicy {
    public static int znajdzMax(int[] tablica) {
        int result = tablica[0];
        for (int i = 0; i < tablica.length; ++i) {
            if (result < tablica[i]) {
                result = tablica[i];
            }
        }
        return result;
    }

    public static int znajdzMin(int[] tablica) {
        int result = tablica[0];
        for (int i = 0; i < tablica.length; ++i) {
            if (result > tablica[i]) {
                result = tablica[i];
            }
        }
        return result;
    }

    public static int policzParzyste(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; ++i) {
            if (tablica[i] % 2 == 0) {
                result++;
            }
        }

        return result;
    }

    public static int sumaElementow(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; ++i) {
            result = result + tablica[i];

        }
        return result;
    }


}

