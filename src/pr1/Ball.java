package pr1;

public class Ball {
    private String color;
    private int size;

    public Ball() {
        this.color = "Black";
        this.size = 5;
    }

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Ball(String color) {
        this.color = color;
    }

    public Ball(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "This ball is " + color + " and size of " + size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
