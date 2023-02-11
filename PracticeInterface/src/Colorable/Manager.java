package Colorable;

public class Manager {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Square(17);
        shapes[1] = new Circle(12);

        for (Shape shape : shapes) {
            if (shape.isFilled()){
                shape.getArea();
                shape.howToColor();
                System.out.println("-----------------------------");
            }
        }
    }
}
