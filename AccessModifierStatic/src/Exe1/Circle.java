package Exe1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area = 3.14 * radius * radius;

    void circle() {}

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }
}
