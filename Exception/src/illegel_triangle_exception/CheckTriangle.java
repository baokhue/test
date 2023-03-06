package illegel_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckTriangle {
    public static void input() {
        Scanner scanner = new Scanner(System.in);

        int edgeA = 0;
        int edgeB = 0;
        int edgeC = 0;

        try {
            System.out.print("Input edge A of triangle: ");
            edgeA = scanner.nextInt();
            System.out.print("Input edge B of triangle: ");
            edgeB = scanner.nextInt();
            System.out.print("Input edge C of Triangle: ");
            edgeC = scanner.nextInt();

            if (edgeA < 0 || edgeB < 0 || edgeC < 0){
                throw new InputMismatchException();
            }

            if (edgeA+edgeB < edgeC || edgeA+edgeC < edgeB || edgeB+edgeC < edgeA){
                throw new IllegalTriangleException();
            }

            System.out.println(edgeA + edgeB + edgeC);
        } catch (InputMismatchException e) {
            System.out.println("Please be sure that all your number are bigger than 0!");
        } catch (IllegalTriangleException e) {
            System.out.println("Please input again! The sum of 2 in 3 numbers must be bigger than another!");
        } catch (Exception e) {
            System.out.println("There are some mistakes!");
        } finally {
            System.out.println("Done!");
        }
    }

    public static void main(String[] args) {
        input();
    }
}
