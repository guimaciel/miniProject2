package week2.arraylists;

import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.print("Array:");
        for(int i = 0; i < intArray.length ; i++) {
            intArray[i] = (int)(Math.random() * 50) + 1;
            System.out.print(" " + intArray[i]);
        }
        System.out.print("\nValue to find: ");
        Scanner sc = new Scanner(System.in);
        int vl = sc.nextInt();

        int count = 0;
        System.out.println();
        for (int i = 0 ; i < intArray.length ; i++) {
            if (vl == intArray[i]) {
                System.out.println(String.format("%d is in slot %d.",vl, i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println(String.format("%d is not in the array.",vl));
        }

    }
}
