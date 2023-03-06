package insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Setting {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the number of index needed to sort: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Input the index at " + i + " of array:");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The original array is: " + Arrays.toString(numbers));
        System.out.println("The sorted array is: " + Arrays.toString(insertionSort(numbers)));
    }

    public static int[] insertionSort(int[] numArr) {

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numArr[j] < numArr[j - 1]) {
                    int temp = numArr[j - 1];
                    numArr[j - 1] = numArr[j];
                    numArr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return numArr;
    }
}
