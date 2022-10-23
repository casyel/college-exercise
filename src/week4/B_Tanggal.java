package week4;

import java.util.Scanner;

public class B_Tanggal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        System.out.print("Tanggal: ");
        int date = scanner.nextInt();
        System.out.print("Bulan: ");
        int month = scanner.nextInt();
        System.out.print("Tahun: ");
        int year = scanner.nextInt();

        System.out.println("Output :");

        String dateNumeric ="";
        switch (date){
            case 1:
                dateNumeric = "Satu ";
                break;
            case 2:
                dateNumeric = "Dua ";
                break;
            case 3:
                dateNumeric = "Tiga ";
                break;
            case 4:
                dateNumeric = "Empat ";
                break;
            case 5:
                dateNumeric = "Lima ";
                break;
            case 6:
                dateNumeric = "Enam ";
                break;
            case 7:
                dateNumeric = "Tujuh ";
                break;
            case 8:
                dateNumeric = "Delapan ";
                break;
            case 9:
                dateNumeric = "Sembilan ";
                break;
            case 10:
                dateNumeric = "Sepuluh ";
                break;
            case 11:
                dateNumeric = "Sebelas ";
                break;
            case 12:
                dateNumeric = "Dua Belas ";
                break;
            case 13:
                dateNumeric = "Tiga Belas ";
                break;
            case 14:
                dateNumeric = "Delapan ";
                break;
            case 15:
                dateNumeric = "Lima Belas ";
                break;
            case 16:
                dateNumeric = "Enam Belas ";
                break;
            case 17:
                dateNumeric = "Tujuh Belas ";
                break;
            case 18:
                dateNumeric = "Delapan Belas ";
                break;
            case 19:
                dateNumeric = "Sembilan Belas ";
                break;
            case 20:
                dateNumeric = "Dua Puluh ";
                break;
            case 21:
                dateNumeric = "Dua Puluh Satu ";
                break;
            case 22:
                dateNumeric = "Dua Puluh Dua ";
                break;
            case 23:
                dateNumeric = "Dua Puluh Tiga ";
                break;
            case 24:
                dateNumeric = "Dua Puluh Empat ";
                break;
            case 25:
                dateNumeric = "Dua Puluh Lima ";
                break;
            case 26:
                dateNumeric = "Dua Puluh Enam ";
                break;
            case 27:
                dateNumeric = "Dua Puluh Tujuh ";
                break;
            case 28:
                dateNumeric = "Dua Puluh Delapan ";
                break;
            case 29:
                dateNumeric = "Dua Puluh Sembilan ";
                break;
            case 30:
                dateNumeric = "Tiga Puluh ";
                break;
            case 31:
                dateNumeric = "Tiga Puluh Satu ";
                break;
        }

        String monthNumeric = "";
        switch (month) {
            case 1:
                monthNumeric = "Januari ";
                break;
            case 2:
                monthNumeric = "Februari ";
                break;
            case 3:
                monthNumeric = "Maret ";
                break;
            case 4:
                monthNumeric = "April ";
                break;
            case 5:
                monthNumeric = "Mei ";
                break;
            case 6:
                monthNumeric = "Juni ";
                break;
            case 7:
                monthNumeric = "Juli ";
                break;
            case 8:
                monthNumeric = "Agustus ";
                break;
            case 9:
                monthNumeric = "September ";
                break;
            case 10:
                monthNumeric = "Oktober ";
                break;
            case 11:
                monthNumeric = "November ";
                break;
            case 12:
                monthNumeric = "Desember ";
                break;
        }

        String yearString="";
        if (year >= 10){
            yearString = "20" + year;
        } else {
            yearString = "200" + year;
        }

        System.out.println("Konversi : " + dateNumeric + monthNumeric + yearString);
    }
}
