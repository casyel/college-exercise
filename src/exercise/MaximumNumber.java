package exercise;

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

      int replicaInput = input;
      int reverseInput = 0;

      while(replicaInput != 0)
      {
        int remainder = replicaInput % 10;
        reverseInput = reverseInput * 10 + remainder;
        replicaInput = replicaInput/10;
      }

      int replicaMax = max;
      int reverseMax = 0;

      while(replicaMax != 0)
      {
        int remainder = replicaMax % 10;
        reverseMax = reverseMax * 10 + remainder;
        replicaMax = replicaMax/10;
      }

      if (reverseInput > reverseMax) {
        max = input;
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
