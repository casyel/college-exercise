package latihan;

import java.util.Scanner;

public class Butterfly1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int input = scanner.nextInt();


        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i >= j) {
                    System.out.print(i + "" + j + " ");
                } else {
                    System.out.print("   ");
                }
            }

            for (int j = 0; j < input; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < input; j++) {
                if (i + j > input / 2) {
                    System.out.print(i + "" + j + " ");
                System.out.print("** ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println("");
        }
    }
}
