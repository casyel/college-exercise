package week1;

import java.util.Scanner;

public class C_derajat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Celcius: ");
        double celciusInput = scanner.nextDouble();
        double fahrenhait = 9.0/5.0 * celciusInput + 32;
        double reamur = 4.0/5.0 * celciusInput;

        System.out.println("Konversi " + celciusInput + " derajat Celcius:");
        System.out.println(fahrenhait +" derajat Fahrenhait");
        System.out.println(reamur + " derajat Reamur");

    }
}
