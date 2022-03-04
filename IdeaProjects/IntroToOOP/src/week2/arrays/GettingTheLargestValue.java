package week2.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int num = 0;
        for (int i = 0 ; i < 10 ; i++) {
            num = (int)(Math.random() * 100 + 1);
            ar.add(num);
        }
        System.out.println("ArrayList: " + ar);
        System.out.println();
        num = 0;
        for ( int i = 0 ; i < ar.size() ; i++ ) {
            if (ar.get(i) > num) {
                num = ar.get(i);
            }
        }
        System.out.println("The largest value is " + num);
    }
}
