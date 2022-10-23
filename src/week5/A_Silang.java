package week5;

import java.util.Scanner;

public class A_Silang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input tinggi x : ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i == j || (i + j == input - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


