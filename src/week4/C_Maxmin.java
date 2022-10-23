package week4;

import java.util.Scanner;

public class C_Maxmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input :");
        System.out.print("Banyaknya Bilangan: ");
        int input = scanner.nextInt();


        int max = 0;
        int min = 0;
        int sum = 0;
        for (int i = 0; i < input; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + " : ");
            int number = scanner.nextInt();

            if (i == 0) {
                min = number;
                max = number;
            } else {
                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            }
            sum = sum+number;
        }
        double avar = sum/input;
        System.out.println("Output :");
        System.out.println("Bilangan Terbesar: " + max);
        System.out.println("Bilangan Terkecil: " + min);
        System.out.println("Rerata: " + avar);
    }
}
