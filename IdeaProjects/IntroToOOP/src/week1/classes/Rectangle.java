package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = validateSide(width);
        this.height = validateSide(height);
        this.color = validateColour(color);
    }

    private int validateSide(int number) {
        if (number <= 0) {
            return 1;
        }
        return number;
    }

    private String validateColour(String color) {
        if (color.length() > 2
                && color.length() < 20
                && (color.charAt(0) >= 'A' && color.charAt(0) <= 'Z')) {
            return color;
        } else {
            return "Blue";
        }
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

        this.color = validateColour(color);
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
