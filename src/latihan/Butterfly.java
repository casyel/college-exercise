package latihan;

import java.util.Scanner;

public class Butterfly {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input: ");
    int input = scanner.nextInt();

    for (int i = 0; i < input; i++) {
      for (int j = 0; j < input; j++) {
        if (i >= j) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      for (int j = 0; j < 1; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < input; j++) {
        if (i + j > input / 2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println("");
    }

    for (int j = 0; j < input * 2 + 1; j++) {
      System.out.print("*");
    }

    System.out.println();

    for (int i = 0; i < input; i++) {
      for (int j = 0; j < input; j++) {
        if (i + j > (input / 2) + 1) {
          System.out.print(" ");
        } else {
          System.out.print("*");

        }
      }

      for (int j = 0; j < 1; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < input; j++) {
        if (i > j) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }

      System.out.println("");
    }
  }
}
