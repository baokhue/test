package ss4_class_and_object;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double r1;
    private double r2;

    public QuadraticEquation() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        delta = b * 2 - 4 * a * c;
        return delta;
    }

    public double  getRoot1() {
        r1 = (-b + Math.pow(b * 2 - 4 * a * c, 0.5));
        return r1;
    }

    public double getRoot2() {
        r2 = (-b + Math.pow(b * 2 - 4 * a * c, 0.5));
        return r2;
    }

    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        System.out.println("Input a: ");
        a = sc.nextDouble();
        System.out.println("Input b: ");
        b = sc.nextDouble();
        System.out.println("Input c: ");
        c = sc.nextDouble();
    }
}
