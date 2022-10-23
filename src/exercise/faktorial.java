package exercise;

public class faktorial {
    public static void main(String[] args) {

        int x = 3;
        int temp = 1;

        for (int i = 1; i <= x; i++) {
            temp = temp * i;
        }

        System.out.println(temp);
    }
}
