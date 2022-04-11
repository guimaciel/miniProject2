package labs.miniProject2;

public class Driver {
    private static final String listContacts = "1";
    private static final String addContact = "2";
    private static final String removeContact = "3";
    private static final String updateContact = "4";
    private static final String quit = "5";

    public static void main(String[] args) {
        String option = "";
        ContactList cl = new ContactList();
        while (!option.equals("5")) {
            InputCollector.printMenu();
            option = InputCollector.getUserInput("Enter your option: ");

            switch(option) {
                case "1":
                    cl.printList();
                    break;
                case "2":
                    InputCollector.addContact(cl);
                    break;
                case "3":
                    InputCollector.removeContact(cl);
                    break;
                case "4":
                    InputCollector.updateContact(cl);
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;

            }
        }
        System.out.println("\nBye!");



    }
}
