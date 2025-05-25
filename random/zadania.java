package random;

import java.util.*;

public class zadania {
    public static void main(String[] args) {

        Random randint = new Random();
        int target = randint.nextInt(1, 100);

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter guess: ");

            int guess = in.nextInt();

            if (guess == target) {
                System.out.println("yippie");
                break;
            } else if (guess > target) {
                System.out.println("down");
            } else {
                System.out.println("up");
            }
        }
    }
}
