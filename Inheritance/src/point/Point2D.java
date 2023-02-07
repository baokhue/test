package point;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = {x, y};
        return xy;
    }

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    public void displayItem() {
        float[] item = getXY();
        System.out.println("Point 2D:");
        for (float a : item) {
            System.out.println(" - " + a);
        }
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
