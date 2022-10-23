package latihan;

import java.util.Scanner;

public class BinaryConversion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ayo Konversi!!");
    System.out.println("1. Binary to Decimal");
    System.out.println("2. Decimal to Binary");
    System.out.print("\nPilihan Menu:");
    int menu = scanner.nextInt();

    String binary = "";
    int decimal;

    switch (menu) {
      case 1:
        System.out.print("Masukan Binary:");
        binary = scanner.next();

        if (binary.length() == 8) {
          int total = 0;

          for (int i = 0; i < 8; i++) {
            int binaryNumber = Integer.parseInt(String.valueOf(binary.charAt(i)));
            total = (int) (total + Math.pow(2, (7 - i)) * binaryNumber);
          }

          decimal = total;
          System.out.println("Decimal:" + decimal);
        }
        break;

      case 2:
        System.out.print("Masukan Decimal:");
        decimal = scanner.nextInt();

        for (int i = 7; i >= 0; i--) {
          int x = Integer.valueOf((int) (decimal/Math.pow(2,i)));
          binary = binary + x;
          decimal = (int) (decimal - (x * Math.pow(2, i)));
        }
        System.out.println(binary);
        break;

      default:
        break;
    }
  }
}
