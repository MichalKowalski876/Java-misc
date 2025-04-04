package func_excercise;


public class KalkulatorGeometryczny {


    public static int obliczPoleKwadratu(int bok) {
        return bok * bok;
    }

    public static int obliczObwodKwadratu(int bok) {
        return bok * 4;
    }

    public static double obliczPoleTrojkata(double podstawa, double wysokosc) {
        return (podstawa * wysokosc) * 0.5;
    }

    public static int obliczObwodProstokata(int szerokosc, int wysokosc) {
        return szerokosc * 2 + wysokosc * 2;
    }
}


