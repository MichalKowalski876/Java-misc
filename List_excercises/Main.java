package List_excercises;

public class Main {
    public static void branch() {
        String[] res = Zadania.createShopTable(10);
        for(int i = 0; i < 11; i++){
            System.out.println(res[i]);
        }
    }
}
