package Shapes;

public class ShapesTest {
        public static void main(String[] args) {
            Measurable myShape;

            // Test Rectangle
            myShape = new Rectangle(5, 7);
            System.out.println("Rectangle Area: " + myShape.getArea());
            System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());

            // Test Square
            myShape = new Square(5);
            System.out.println("Square Area: " + myShape.getArea());
            System.out.println("Square Perimeter: " + myShape.getPerimeter());
}}
