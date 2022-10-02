package week2;

import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Mahasiswa : ");
        String nama = scanner.next();
        System.out.print("Nilai UTS      : ");
        int uts = scanner.nextInt();
        System.out.print("Nilai UAS      : ");
        int uas = scanner.nextInt();
        System.out.print("Nilai KAT      : ");
        int kat = scanner.nextInt();
        System.out.print("Bobot<%> nilai UTS: ");
        int bobotuts = scanner.nextInt();
        System.out.print("Bobot<%> nilai UAS: ");
        int bobotuas = scanner.nextInt();
        System.out.print("Bobot<%> nilai KAT: ");
        int bobotkat = scanner.nextInt();

        System.out.println("=============================");
        System.out.println("Perhitungan Nilai Mahasiswa :");
        System.out.println("=============================");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.println("Nilai KAT   : " + kat);
        System.out.println("Bobot <%> nilai UTS : " + (double)bobotuts);
        System.out.println("Bobot <%> nilai UAS : " + (double)bobotuas);
        System.out.println("Bobot <%> nilai KAT : " + (double)bobotkat);
        System.out.println("=========================================");
        System.out.println("Please wait...calculating...");
        System.out.println("=========================================");

        double hasiluts = (uts*(double)bobotuts) /100;
        double hasiluas = (uas*(double)bobotuas) /100;
        double hasilkat = (kat*(double)bobotkat) /100;
        double nilaiakhir = hasiluts + hasiluas + hasilkat;
        System.out.println("Nilai akhir " + nama + " : " + nilaiakhir);
        System.out.println("pembulatan :" + (Math.round(nilaiakhir)));






    }
}
