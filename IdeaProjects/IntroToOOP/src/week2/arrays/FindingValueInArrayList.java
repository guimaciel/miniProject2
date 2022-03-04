package week2.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int num = 0;
        for (int i = 0 ; i < 10 ; i++) {
            num = (int)(Math.random() * 50 + 1);
            ar.add(num);
        }
        System.out.println("ArrayList: " + ar);
        System.out.print("Value to find: ");
        Scanner sc = new Scanner(System.in);
        int vl = sc.nextInt();
        System.out.println();
        for ( int i = 0 ; i < ar.size() ; i++ ) {
            if (ar.get(i) == vl) {
                System.out.println(vl + " is in the ArrayList.");
            }
        }
    }
}
