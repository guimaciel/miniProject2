package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = validateSide(width);
        this.height = validateSide(height);
        this.color = color.toUpperCase();
    }

    private int validateSide(int number) {
        if (number <= 0) {
            return 1;
        }
        return number;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = validateSide(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = validateSide(height);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.toUpperCase();
    }

    public void draw() {
        for (int i = 0 ; i < height ; i++ ) {
            for ( int j = 0 ; j < width ; j++ ) {
                System.out.print(color.substring(0,1));
            }
            System.out.println();
        }
    }
}
