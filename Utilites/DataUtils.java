package Utilites;

public class DataUtils {
    public static int[] emptyArr = {};

    public static int[] mixedArr = {5, -2, 0, 99, -10, 8};

    public static final int[] testArr = {10, 2, 33, 2, 18, 7, 0, 10};

    public static final int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8};

    public static int[] reversedArr = {9, 7, 5, 3, 1};

    public static void swap(int[] arr, int elementA, int elementB) {
        int temp = arr[elementA];
        arr[elementA] = arr[elementB];
        arr[elementB] = temp;
    }

}
