package labs.miniProject2;

public class Driver {
    public static void main(String[] args) {
        int opc = 0;
        while (opc != 5) {
            InputCollector.printMenu();
            opc = Integer.valueOf(InputCollector.getUserInput("Enter your option: "));
        }
        System.out.println("\nBye!");
        return;

    }
}
