package week1;

import java.util.Scanner;

public class A_jam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input jam: ");
        int hour = scanner.nextInt();

        System.out.println("Hasil konversi " + hour + " jam:");
        System.out.println("Nilai menit: " + (hour * 60) + " menit");
        System.out.println("Nilai detik: " + (hour * 60 * 60) + " detik");
    }
}
