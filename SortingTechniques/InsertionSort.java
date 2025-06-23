package SortingTechniques;

import Utilites.DataUtils;

import java.util.Arrays;

/**
 * Insertion Sort:
 * compare and swap elements from right to left
 */
public class InsertionSort {

    public static int[] insertionSort(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j])
                    DataUtils.swap(arr, j - 1, j);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] mixedArr = insertionSort(DataUtils.mixedArr, DataUtils.mixedArr.length);
        int[] testArr = insertionSort(DataUtils.testArr, DataUtils.testArr.length);
        Arrays.stream(mixedArr).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println(":".repeat(10));
        Arrays.stream(testArr).forEach((t) -> System.out.print(t + " "));
    }
}
