package exercise;

public class pangkat {
    public static void main(String[] args) {
        int angka = 3;
        int pangkat = 5;
        int result = angka;

        for (int i = 2; i <= pangkat; i++) {
            result = result * angka;


        }


        System.out.println(result);
    }
}
