package Resizeable;

public class Circle implements IResizeable{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        double beforeS = Math.PI * radius * radius;
        System.out.println("Before circle area: " + beforeS);
        double afterS = beforeS + (beforeS * (percent / 100));
        System.out.println("After circle area: " + afterS);
        System.out.println("------------------------");
    }
}
