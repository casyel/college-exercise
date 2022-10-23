package week5;

import java.util.Scanner;

public class B_Segitiga1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input tinggi segitiga : ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input-1; j++) {
                if(i+j >= input-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < input; j++) {
                if (i >= j) {
                    System.out.print("*");
                    }
                }
                System.out.println();
            }
    }
}

