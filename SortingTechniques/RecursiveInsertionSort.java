package SortingTechniques;

import Utilites.DataUtils;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void insertionSort(int[] arr, int N, int i) {
        if (i == N) return;

        for (int j = i; j > 0; j--) {
            if (arr[j - 1] > arr[j])
                DataUtils.swap(arr, j - 1, j);

        }
        insertionSort(arr, N, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = DataUtils.sortedArr;
        insertionSort(arr, arr.length,0);
        Arrays.stream(arr)
                .forEach(s -> System.out.print(s + ","));
    }
}
