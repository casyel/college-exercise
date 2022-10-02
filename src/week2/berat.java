package week2;

import java.util.Scanner;

public class berat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berat (gr) : ");
        int inputan = scanner.nextInt();

        int kilogram = inputan/1000;
        double pound = inputan*0.00220;

        System.out.println("\nBerat (kg) : " + kilogram);
        System.out.println("Berat (pon): " + pound);

    }
}
