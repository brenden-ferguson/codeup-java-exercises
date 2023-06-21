package Shapes;

public class Circle {

    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    public Double getArea(){
//        area = pi x (radius ^ 2)
        return Math.PI * (radius*radius);
    }

    public Double getCircumference(){
//        circumference = 2 x pi x radius
        return 2 * Math.PI * radius;
    }

}
