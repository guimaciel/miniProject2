package labs.miniProject2;

import java.util.Scanner;

public class InputCollector {
    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void printMenu() {
        System.out.println("+===== Contact App =====+");
        System.out.println("| 1. List all Contacts  |");
        System.out.println("| 2. Add new Contact    |");
        System.out.println("| 3. Remove Contact     |");
        System.out.println("| 4. Update Contact     |");
        System.out.println("| 5. Quit               |");
        System.out.println("+=======================+");
    }
}
