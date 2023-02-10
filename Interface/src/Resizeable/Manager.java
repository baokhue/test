package Resizeable;

public class Manager {
     public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3);
        shapes[1] = new Square(2);
        shapes[2] = new Rectangle(3,2);



        for (Shape shape : shapes) {
            double percent = Math.random() * 100;
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
