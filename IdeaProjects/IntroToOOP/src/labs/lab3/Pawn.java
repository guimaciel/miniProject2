package labs.lab3;

import java.util.Objects;

public class Pawn extends Piece {
    private boolean promoted;
    private Piece newPiece;

    public Pawn(boolean isWhite) {
        super(1,isWhite);
        this.promoted = false;
        this.newPiece = null;
    }

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super(value,isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pawn p = (Pawn) o;

        if (this.promoted != p.promoted) return false;
        return this.newPiece.equals(p.newPiece);
    }

    @Override
    public String toString() {
        if (promoted) {
            return "Pawn{" +
                    "value=" + this.getValue() +
                    ", isWhite=" + this.isWhite() +
                    ", promoted=" + promoted +
                    ", newPiece=" + newPiece.toString() +
                    "}";
        } else {
            return "Pawn{" +
                    "value=" + this.getValue() +
                    ", isWhite=" + this.isWhite() +
                    ", promoted=" + promoted +
                    "}";
        }
    }

    public void promote(Piece newPiece) {
        this.promoted = true;
        this.newPiece = newPiece;
    }

}
