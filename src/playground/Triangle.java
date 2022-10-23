package playground;

public class Triangle {
    public static void main(String[] args) {
        int number = 10;
        int boundary = 1;

        for (int i = 1; i <= number * number; i++) {

            if (i <= boundary) {
                if (i < 10) {
                    System.out.print("0" + i + " ");
                } else {
                    System.out.print(i + " ");
                }
            } else {
                System.out.print("   ");
            }

            if (i % number == 0) {
                System.out.println();
                boundary += number + 1;
            }
        }
    }
}
