package random;

import java.util.*;

public class Zadania {
    public static void main(String[] args) {

//        Random randint = new Random();
//        int target = randint.nextInt(1, 100);
//
//        Scanner in = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter guess: ");
//
//            int guess = in.nextInt();
//
//            if (guess == target) {
//                System.out.println("yippie");
//                break;
//            } else if (guess > target) {
//                System.out.println("down");
//            } else {
//                System.out.println("up");
//            }
    }

    public static Set<Integer> wygenerujUnikalneLiczby(int num, int min, int max) {
        Random randint = new Random();
//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Max: ");
//        int max = myObj.nextInt();
//
//        System.out.println("Min: ");
//        int min = myObj.nextInt();
//
//        System.out.println("Ile: ");
//        int num = myObj.nextInt();

        Set<Integer> result = new HashSet<>();

        if (min > max || 0 > max || 0 > min || num > (max - min)) {
            return result;
        }
        for (int i = 0; i < num + 1; i++) {
            int new_num = randint.nextInt(min, max);
            result.add(new_num);
        }
        return result;
    }
}