package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = keyboard.nextLine();
        System.out.println(String.format("\nHi, %s!  How old are you?", name));
        int age = keyboard.nextInt();
        System.out.println(String.format("\nSo you're %d, eh?  That's not old at all!\n" +
                "How much do you make, %s?", age, name));
        double salary = keyboard.nextDouble();
        System.out.println(String.format("\n%.1f!  I hope that's per hour and not per year! LOL!",salary));

    }
}
