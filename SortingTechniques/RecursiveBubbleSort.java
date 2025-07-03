package SortingTechniques;

import Utilites.DataUtils;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void bubbleSort(int[] arr, int N) {
        if (N == 1)
            return;
        for (int j = 0; j <= N - 2; j++) {
            if (arr[j] > arr[j + 1])
                DataUtils.swap(arr, j, j + 1);
        }
        bubbleSort(arr, N - 1);
    }

    public static void main(String[] args) {
        int[] arr = DataUtils.mixedArr;
        bubbleSort(arr, arr.length);
        Arrays.stream(arr)
                .forEach(s -> System.out.print(s + ","));
    }
}
