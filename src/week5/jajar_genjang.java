package week5;

public class jajar_genjang {
    public static void main(String[] args) {
        int input = 21;
        int top = input / 2;
        int bottom = input / 2;

        if (input % 2 == 1) {
            top++;
        }

        for (int i = 0; i < bottom; i++) {
            for (int j = 0; j < bottom; j++) {
                if (i + j == bottom - 1 || j == bottom - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < bottom; i++) {
            for (int j = 0; j < bottom; j++) {
                if (i + j == bottom - 1 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
