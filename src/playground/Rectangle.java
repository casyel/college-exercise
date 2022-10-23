package playground;

public class Rectangle {
    public static void main(String[] args) {
        int number = 3;

        for (int i = 1; i <= number * number; i++) {
//            if (i < 10) {
//                System.out.print("0" + i + " ");
//            } else {
//                System.out.print(i + " ");
//            }

            System.out.print("*  ");

            if (i % number == 0) {
                System.out.println();
            }
        }
    }
}
