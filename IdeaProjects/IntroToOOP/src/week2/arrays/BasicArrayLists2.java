package week2.arrays;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int num = 0;
        for (int i = 0 ; i < 10 ; i++) {
            num = (int)(Math.random() * 100 + 1);
            ar.add(num);
        }
        System.out.println("ArrayList: " + ar);

    }
}
