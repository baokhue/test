package Resizeable;

public class Square implements IResizeable{
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return edge * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + getEdge() +
                +'}'
                + ", which is a subclass of "
                + super.toString()
                +"\n";
    }

    @Override
    public void resize(double percent) {
        System.out.println("The area of square before resizing is: " + getArea());
        this.edge = (edge * percent) / 100;
        System.out.println("The area of square after resizing is: " + getArea());
    }
}
