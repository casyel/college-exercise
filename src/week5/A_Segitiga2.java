package week5;

import java.util.Scanner;

public class A_Segitiga2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input tinggi segitiga : ");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
