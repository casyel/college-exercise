package exercise;

public class Prime {
    public static void main(String[] args) {
        int number = 150;

        for (int i = 1; i <= number; i++) {

            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter++;
                }
            }

            if (i == 1 || counter > 2) {
                if (i % 2 == 0) {
                    System.out.println(i + " bilangan genap");
                } else {
                    System.out.println(i + " bilangan ganjil");
                }
            } else {
                if (i % 2 == 0) {
                    System.out.println(i + " bilangan genap prima");
                } else {
                    System.out.println(i + " bilangan ganjil prima");
                }
            }
        }
    }
}
