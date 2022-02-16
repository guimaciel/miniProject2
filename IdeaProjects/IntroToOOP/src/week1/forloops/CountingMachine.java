package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        System.out.print("Count to: ");
        Scanner kb = new Scanner(System.in);
        int limit = kb.nextInt();
        for ( int i = 0; i <= limit ; i++ ) {
            System.out.print(i + " ");
        }
    }
}
