package func_excercise;

public class MathUtils {
    public static boolean czyDodatnia(double liczba) {
        if (liczba > 0) {
            return true;
        }
        return false;
    }

    public static boolean czyParzysta(int liczba) {
        if (liczba % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean czyLiczbaPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0)
                return false;
        }
        return true;
    }

    public static String printLiczbyPierwsze(int zakresOd, int zakresDo) {
        String output = "";
        if (zakresOd < 2) {
            zakresOd = 2;
        }
        for (int liczba = zakresOd; liczba <= zakresDo; liczba++) {
            boolean czy_pierwsza = true;

            for (int dzielnik = 2; dzielnik <= (liczba / 2); dzielnik++) {
                if (liczba % dzielnik == 0) {
                    czy_pierwsza = false;
                    break;
                }
            }
            if (czy_pierwsza) {
                output = output + String.valueOf(liczba) + " ";
            }
        }
        return output.trim();
    }

    public static int silnia(int n) {
        int output = 1;
        for (int i = 1; i <= n; i++) {
            output = output * i;
        }
        return output;

    }

    public static double metryNaKilometry(double metry) {
        return metry / 1000;
    }

    public static double kilometryNaMetry(double kilometry) {
        return kilometry * 1000;
    }

    public static double kilometryNaMile(double km) {
        return km * 0.62137;
    }

    public static double kilogramyNaFunty(double kg) {
        return kg * 2.20462;
    }

    public static double funtyNaKilogramy(double funty) {
        return Math.round((funty * 0.45359) * 10000.0) / 10000.0;
    }

    public static double celsjuszeNaFahrenheity(double c) {
        return c * 1.8 + 32;
    }

    public static double fahrenheityNaCelsjusze(double f) {
        return (f - 32) * 5 / 9;
    }
}


