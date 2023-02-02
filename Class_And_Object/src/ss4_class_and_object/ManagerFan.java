package ss4_class_and_object;

public class ManagerFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        System.out.println(fan1.toString(false));
        System.out.println(fan2.toString(true));
    }
}
