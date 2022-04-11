package labs.miniProject2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCollector {
    public static String getUserInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static boolean validateName(String name) {
        if (name.length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean validateNumberMandatory(String number) {
        if (number.length() <= 0) {
            return false;
        }
        return validateNumberInput(number);
    }
    
    public static boolean validateNumberInput(String number) {
        if (number.length() <= 0) { return true; }
        try {
            long num = Long.valueOf(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;


    }

    public static void printMenu() {
        System.out.println("\n+===== Contact App =====+");
        System.out.println("| 1. List all Contacts  |");
        System.out.println("| 2. Add new Contact    |");
        System.out.println("| 3. Remove Contact     |");
        System.out.println("| 4. Update Contact     |");
        System.out.println("| 5. Quit               |");
        System.out.println("+=======================+");
    }

    public static void addContact(ContactList cl) {
        String input;
        boolean check = false;
        Contact c = new Contact();
        // Name
        while (!check) {
            input = InputCollector.getUserInput("Enter name:");
            try {
                c.setName(input);
                int index = cl.findContactByName(input);
                if (index >= 0) {
                    System.out.println("Contact [" + cl.contactByIndex(index) + "] already exists and cannot be created!");
                    return;
                }
                check = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        // Mobile
        check = false;
        while (!check) {
            input = InputCollector.getUserInput("Enter mobile:");
            try {
                c.setMobile(input);
                int index = cl.findContactByMobile(input);
                if (index >= 0) {
                    System.out.println("Contact [" + cl.contactByIndex(index) + "] already exists and cannot be created!");
                    return;
                }
                check = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        // Work
        check = false;
        while (!check) {
            input = InputCollector.getUserInput("Enter work:");
            try {
                c.setWork(input);
                check = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        // Home
        check = false;
        while (!check) {
            input = InputCollector.getUserInput("Enter home:");
            try {
                c.setHome(input);
                check = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        // City
        check = false;
        while (!check) {
            input = InputCollector.getUserInput("Enter city:");
            try {
                c.setCity(input);
                check = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        cl.add(c);

    }

    public static void removeContact(ContactList cl) {
        int index;
        try {
            index = Integer.valueOf(InputCollector.getUserInput("Enter index to remove contact: "));
            Contact c = cl.contactByIndex(index);
            if (c != null) {
                System.out.println("Contact removed: " + c);
                cl.removeContact(index);
            } else {
                System.out.println("Contact not found!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid index");
        }

   }

   public static void updateContact(ContactList cl) {
       int index;
       try {
           index = Integer.valueOf(InputCollector.getUserInput("Enter index to remove contact: "));
           Contact c = cl.contactByIndex(index);
           if (c != null) {
               System.out.println("Contact to be updated: " + c);
               String input = InputCollector.getUserInput("Update name:");
               c.setName(input);
               input = InputCollector.getUserInput("Update Mobile:");
               c.setMobile(input);
               input = InputCollector.getUserInput("Update work:");
               c.setWork(input);
               input = InputCollector.getUserInput("Update home:");
               c.setHome(input);
               input = InputCollector.getUserInput("Update city:");
               c.setCity(input);
           } else {
               System.out.println("Contact not found!");
           }
       } catch (NumberFormatException e) {
           System.out.println("Invalid index");
       } catch (Exception e) {
           System.out.println("Invalid input!");
       }
   }
}
