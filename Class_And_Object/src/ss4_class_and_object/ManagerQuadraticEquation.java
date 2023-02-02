package ss4_class_and_object;

public class ManagerQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.inputNumber();
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("The equation has 2 solutions: ");
            System.out.println("r1 = " + quadraticEquation.getRoot1());
            System.out.println("r2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has only 1 solution: ");
            System.out.println("r = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }
    }
}
