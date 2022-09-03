package pr3.p1;

public class Square extends Rectangle {
    public Square() {}
    public Square(double side) {
        width = length = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        width = length = side;
    }
    public void setWidth(double side) {
        width = length = side;
    }
    public void setLength(double side) {
        width = length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
