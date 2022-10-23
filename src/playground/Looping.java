package playground;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input max number: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }

//            System.out.println("number" + i + " counter = " + counter);
            if (counter <= 2) {
                System.out.print("[" + i + "]");
            }
        }
    }
}
