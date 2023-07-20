package Shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea() {
        return length * length;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}
