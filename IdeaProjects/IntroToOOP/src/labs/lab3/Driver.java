package labs.lab3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Piece> arr = new ArrayList<>();

        arr.add(new Pawn(true));
        arr.add(new Queen(true));
        arr.add(new Knight(true));
        arr.add(new Bishop(true));
        arr.add(new Rook(true));
        arr.add(new King(true));

        for (Piece p : arr) {
            p.move();
        }

        Pawn p1 = new Pawn(1,true,true,new Queen(true));
        Pawn p2 = new Pawn(1, true, false, null);
        Pawn p3 = new Pawn(1, false, false, null);
        Pawn p4 = new Pawn(1, false, true, new Queen(true));
        Pawn p5 = new Pawn(1, true, true, new Knight(true));

        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.equals(p4)); // false
        System.out.println(p1.equals(p5)); // false
        System.out.println(p2.equals(p3)); // false
        System.out.println(p4.equals(p5)); // false

        System.out.println("\nSpecial moove - Promotion");
        System.out.println("+== You can promote your Pawn! ==+");
        System.out.println("| [1] Queen                      |");
        System.out.println("| [2] Knight                     |");
        System.out.println("| [3] Bishop                     |");
        System.out.println("| [4] Rook                       |");
        System.out.println("+================================+");

        Scanner sc = new Scanner(System.in);
        int opt = -1;
        while (opt < 1 || opt > 4) {
            try {
                System.out.print("Choose an option: ");
                opt = Integer.valueOf(sc.nextLine());
                if (opt < 1 || opt >4 ) {
                    System.out.println("Invalid option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }

        System.out.println("Before promotion:");
        Piece p6 = new Pawn(false);
        System.out.println(p6);
        switch (opt) {
            case 1: // Queen
                ((Pawn) p6).promote(new Queen(p1.isWhite()));
                break;
            case 2: // Knight
                ((Pawn) p6).promote(new Knight(p1.isWhite()));
                break;
            case 3: // Bishop
                ((Pawn) p6).promote(new Bishop(p1.isWhite()));
                break;
            case 4: // Rook
                ((Pawn) p6).promote(new Rook(p1.isWhite()));
                break;
        }
        System.out.println("After promotion:");
        System.out.println(p6);





    }
}
