package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int sum = 0, number = 1;
        Scanner kb = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        while ( number != 0) {
            System.out.print("Number: ");
            number = Integer.valueOf(kb.nextLine());
            sum += number;
            if (number != 0) {
                System.out.println(String.format("The total so far is %d", sum));
            }
        }
        System.out.println(String.format("\nThe total is %d", sum));
    }
}
