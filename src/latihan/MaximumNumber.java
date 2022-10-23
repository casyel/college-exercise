package latihan;

import java.util.Scanner;

public class MaximumNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan jumlah angka: ");
    int number = scanner.nextInt();

    int counter = 1;
    int max = 0;

    do {
      System.out.print("Angka ke-" + counter + ":");
      int input = scanner.nextInt();


      int reverse = 0;
      while(input != 0)
      {
        int remainder = input % 10;
        reverse = reverse * 10 + remainder;
        input = input/10;
      }

      if (reverse > max) {
        max = reverse;
      }

      if (input >= 0) {
        counter++;
      } else {
        System.out.println("input tidak boleh negatif");
      }
    } while (counter <= number);

    System.out.println("output maksimal:" + max);
  }
}
