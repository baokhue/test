package point;

public class Manager {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2, 3, 4);
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D);
        System.out.println(point3D);
        point2D.displayItem();
        point3D.displayItem3D();
    }
}
