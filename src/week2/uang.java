package week2;

import java.util.Scanner;

public class uang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistem Penjabaran Mata Uang : ");

        System.out.print("Jumlah Uang    : ");
        int inputan = scanner.nextInt();
        int temp = inputan;
        int million = temp/1_000_000;
        temp = (temp-(1_000_000*million));
        int hundredThousand = temp/100_000;
        temp = (temp-(100_000*hundredThousand));
        int tensThousand = temp/10_000;
        temp = (temp-(10_000*tensThousand));
        int thousand = temp/1000;
        temp = (temp-(1000*thousand));
        int hundred = temp/100;
        temp = (temp-(100*hundred));
        int tens = temp/10;
        temp = (temp-(10*tens));


        System.out.println("Jutaan         : " + million);
        System.out.println("Ratusan Ribu   : " + hundredThousand);
        System.out.println("Puluhan Ribu   : " + tensThousand);
        System.out.println("Ratusan Ribu   : " + hundredThousand);
        System.out.println("Ribuan         : " + thousand);
        System.out.println("Ratusan        : " + hundred);
        System.out.println("Puluhan        : " + tens);
        System.out.println("Satuan         : " + temp);

    }
}
