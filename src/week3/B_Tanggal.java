package week3;

import java.util.Scanner;

public class B_Tanggal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");

        System.out.print("Tanggal: ");
        int date = scanner.nextInt();

        System.out.print("Bulan: ");
        int month = scanner.nextInt();

        System.out.print("Tahun: ");
        int year = scanner.nextInt();

        String dateString = "";
        if (date < 10) {
            dateString = "0" + date;
        } else {
            dateString = "" + date;
        }

        String monthString = "";
        if (month == 1) {
            monthString = "Januari";
        }

        if (month == 2) {
            monthString = "Februari";
        }

        if (month == 3) {
            monthString = "Maret";
        }

        if (month == 4) {
            monthString = "April";
        }

        if (month == 5) {
            monthString = "Mei";
        }

        if (month == 6) {
            monthString = "Juni";
        }

        if (month == 7) {
            monthString = "Juli";
        }

        if (month == 8) {
            monthString = "Agustus";
        }

        if (month == 9) {
            monthString = "September";
        }

        if (month == 10) {
            monthString = "Oktober";
        }

        if (month == 11) {
            monthString = "November";
        }

        if (month == 12) {
            monthString = "Desember";
        }

        String yearString = "";
        if (year < 10) {
            yearString = "200" + year;
        } else {
            yearString = "20" + year;
        }

        String output = dateString + " " + monthString + " " + yearString;
        System.out.println("Output :");
        System.out.print("Konversi : " + output);
    }
}
