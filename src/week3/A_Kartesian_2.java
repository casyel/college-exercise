package week3;

import java.util.Scanner;

public class A_Kartesian_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input :");
        System.out.print("Masukkan koordinat x titik acuan: ");
        int xBase = scanner.nextInt();

        System.out.print("Masukkan koordinat y titik acuan: ");
        int yBase = scanner.nextInt();

        System.out.print("Masukkan koordinat x titik: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan koordinat y titik: ");
        int y = scanner.nextInt();

        String position = "";
        if (yBase == y) {
            if (xBase > x) {
                position = "kiri";
            } else {
                position = "kanan";
            }
        }
        if (xBase == x) {
            if (yBase > y) {
                position = "bawah";
            } else {
                position = "atas";
            }
        }
        if (yBase > y && xBase != x) {
            if (xBase > x) {
                position = "kiri bawah";
            } else {
                position = "kanan bawah";
            }
        }
        if (yBase < y && xBase != x) {
            if (xBase > x) {
                position = "kiri atas";
            } else {
                position = "kanan atas";
            }
        }

        System.out.println("Output:");
        System.out.print("Titik (" + xBase + "," + yBase + ") terletak disebelah " + position + " dari titik acuan (" + x + "," + y + ")");
    }
}
