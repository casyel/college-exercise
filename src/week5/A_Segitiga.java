package week5;

import java.util.Scanner;

public class A_Segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input tinggi segitiga : ");
        int input = scanner.nextInt();


        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if(i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
