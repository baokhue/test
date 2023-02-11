package Colorable;

public class Square extends Shape implements IColorable{
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

    public void getArea() {
        double S = edge * edge;
        System.out.println("Area square: " + S);
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
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
