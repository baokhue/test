package insertion_sort;

import java.util.Arrays;

public class Illustration {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;

            for (; k >= 0 && array[k] > currentElement ; k--) {
                array[k+1] = array[k];
            }
            array[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 7, 12, 3, 11};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
