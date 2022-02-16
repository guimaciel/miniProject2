package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String name = kb.nextLine();
        System.out.print(String.format("Ok, %s, how old are you? ", name));
        int age = kb.nextInt();
        System.out.println();
        if (age < 16 ) {
            System.out.println(String.format("You can't drive, %s.", name));
        } else if ( age <= 17 ) {
            System.out.println(String.format("You can drive but you can't vote, %s.", name));
        } else if ( age <= 24 ) {
            System.out.println(String.format("You can vote but you can't rent a car, %s.", name));
        } else {
            System.out.println(String.format("You can do pretty much anything, %s.", name));
        }
    }
}
