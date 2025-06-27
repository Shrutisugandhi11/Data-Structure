package SortingTechniques;

import Utilites.DataUtils;

import java.util.Arrays;

import static Utilites.DataUtils.swap;

/**
 * Quick Sort: pick a pivot, with the help of two pointers low and high sort smaller elements in the left;
 * and larger elements to right.
 * once sorting is done place pivot to its right position
 */

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i <= high && arr[i] <= pivot)
                i++;
            while (j > low && arr[j] >= pivot)
                j--;
            if (i < j)
                swap(arr, i, j);
        }

        swap(arr, low, j);
        pivot = j;    //assign j to pivot as pivot was low
        return pivot;
    }

    public static void main(String[] args) {
        int[] arr = DataUtils.testArr;

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
