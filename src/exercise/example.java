package exercise;

import java.util.ArrayList;
import java.util.Collections;

public class example {
    public static void main(String[] args) {
       int numbers[] = new int[]{4,55,234,99};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(55);
        integers.add(234);
        integers.add(99);


        System.out.println(Collections.max(integers));
    }
}
