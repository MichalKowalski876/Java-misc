package List_excercises;

public class Zadania {

    public static String[] createShopTable(int size) {
        String[] shopTable = new String[size];
        int klawCount = 1;
        int myszCount = 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0 && i % 3 != 0 && i != 0) {
                shopTable[i] = "Mysz_" + myszCount;
                myszCount++;
            } else if (i % 3 == 0 && i % 2 != 0 && i != 0) {
                shopTable[i] = "Klawiatura_" + klawCount;
                klawCount++;
            } else {
                shopTable[i] = "Podkładka";
            }
        }
        shopTable[size - 1] = "LIMITED_EDITION";

        System.out.print("[ ");
        for (int i = 0; i < shopTable.length; i++) {
            System.out.print(shopTable[i]);
            if (i < shopTable.length - 1)
                System.out.print(", ");
        }
        System.out.println(" ]");

        return shopTable;
    }

    public static String passWordAnalyzation(String passWord) {
        int result[] = new int[5];

        int num_count = 0;
        int lower_case_count = 0;
        int upper_case_count = 0;
        int special_char = 0;

        for (int i = 0; i < passWord.length(); i++) {
            if (Character.isDigit(passWord.charAt(i))) {
                num_count++;
            } else if (Character.isLowerCase(passWord.charAt(i))) {
                lower_case_count++;
            } else if (Character.isUpperCase(passWord.charAt(i))) {
                upper_case_count++;
            } else {
                special_char++;
            }
        }

        result[0] = passWord.length();
        result[1] = num_count;
        result[2] = lower_case_count;
        result[3] = upper_case_count;
        result[4] = special_char;

        String result_str = "{" + result[0] + ", " + result[1] + ", " + result[2] + ", " + result[3] + ", " + result[4] + "}";
        return result_str;
    }
}