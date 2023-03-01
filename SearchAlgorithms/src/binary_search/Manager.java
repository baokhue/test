package binary_search;

import java.util.Arrays;

public class Manager {
    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(myArr, 1));
//        Java đã tích hợp sẵn:
//        System.out.println(Arrays.binarySearch(myArr, 1));
    }
}