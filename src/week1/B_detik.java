package week1;

import java.util.Scanner;

public class B_detik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Detik: ");
        int secondInput = scanner.nextInt();
        int hour= secondInput/3600;
        int minute= secondInput % 3600 / 60;
        int second= secondInput % 3600 % 60;


        System.out.println("Jumlah jam, menit dan detik sisa dari " + secondInput + " detik:");
        System.out.println( hour + " jam " + minute + " menit " + second + " detik ");

    }
}
