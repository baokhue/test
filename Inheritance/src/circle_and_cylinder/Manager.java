package circle_and_cylinder;

public class Manager {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, " red", 4);
        System.out.println(cylinder);
        System.out.println("Vol of Cylinder: " + cylinder.getVol());
    }
}
