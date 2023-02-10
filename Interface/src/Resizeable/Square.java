package Resizeable;

public class Square implements IResizeable{
    private double length, wight;

    public Square() {
    }

    public Square(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wight=" + wight +
                '}';
    }

    @Override
    public void resize(double percent) {
        double beforeS = (length + wight) * 2;
        System.out.println("Before square area: " + beforeS);
        double afterS = beforeS + (beforeS * (percent / 100));
        System.out.println("After square area: " + afterS);
    }
}
