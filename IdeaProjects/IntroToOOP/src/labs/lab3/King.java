package labs.lab3;

public class King extends Piece{

    public King(boolean isWhite) {
        super(1000,isWhite);
    }

    public King(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{" +
                "value=" + this.getValue() +
                ", isWhite=" + this.isWhite() +
                "}";
    }
}
