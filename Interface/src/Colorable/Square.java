package Colorable;

public class Square implements IColorable{

    public Square() {
    }
    
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
