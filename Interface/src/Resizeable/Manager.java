package Resizeable;

public class Manager {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2, 5);
        Square square = new Square(4,6);
        circle.resize(5);
        rectangle.resize(10);
        square.resize(15);
    }
}
