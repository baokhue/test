package point;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {getX(), getY(), z};
        return xyz;
    }

    public void setXYZ(float z, float x, float y) {
        super.setXY(x , y);
        this.z = z;
    }

    public void displayItem3D() {
        float[] item = getXYZ();
        System.out.println("Point 3D: ");
        for (float a : item) {
            System.out.println(" - " + a);
        }
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
