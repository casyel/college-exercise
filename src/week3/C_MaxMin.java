package week3;

import java.util.Scanner;

public class C_MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        System.out.print("Banyakmya bilangan: ");
        int input = scanner.nextInt();

        int min = 0;
        int max = 0;

        for (int i = 0; i < input; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (i == 0) {
                min = number;
                max = number;
            } else {
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            }
        }

        System.out.println("Output:");
        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);

    }
}
