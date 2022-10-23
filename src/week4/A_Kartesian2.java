package week4;

import java.util.Scanner;

public class A_Kartesian2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        System.out.print("Masukkan koordinat x titik acuan: ");
        int xbase = scanner.nextInt();

        System.out.print("Masukkan koordinnat y titik acuan: ");
        int ybase = scanner.nextInt();

        System.out.print("Masukkan koordinat x titik: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan koordinat y titik: ");
        int y = scanner.nextInt();

        System.out.println("Output: ");

        String position = "";
        if (ybase == y && xbase != x){
            if (xbase > x){
                position = "Kiri";
            } else {
                position = "Kanan";
            }
        }
        if (xbase == x && ybase != y){
            if (ybase > y){
                position = "Bawah";
            } else {
                position = "Atas";
            }
        }
        if (ybase > y && xbase != x){
            if (xbase > x){
                position = "Kiri bawah";
            } else {
                position = "Kanan Bawah";
            }
        }
        if (ybase < y && xbase != x){
            if (xbase > x){
                position = "Kiri atas";
            } else {
                position = "Kanan atas";
            }
        }

        double kuadrat = Math.pow(x-xbase,2);
        double kuadrat2 = Math.pow(y-ybase,2);
        double jarak = Math.sqrt(kuadrat + kuadrat2);

        System.out.println("Titik ("+ x + "," + y + ") terletak disebelah "+ position + " dari titik acuan ("+ xbase + "," + ybase +") dan jarak kedua titik tersebut adalah " + jarak);
    }
}
