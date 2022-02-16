package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");
        String name = kb.nextLine();
        System.out.print(String.format("\nHi, %s!  How old are you? ",name));
        int age = kb.nextInt();
        System.out.print(String.format("\nDid you know that in five years you will be %d years old?\n" +
                "And five years ago you were %d! Imagine that!", age + 5, age - 5));
    }
}
