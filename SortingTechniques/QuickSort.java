package SortingTechniques;

import Utilites.DataUtils;

import java.util.Arrays;

import static Utilites.DataUtils.swap;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[pivot] > arr[i] && i<=high)
                i++;
            while (arr[pivot] < arr[j] && j>=low)
                j--;
            swap(arr, i, j);
        }
        swap(arr, pivot, j);
        pivot = j;    //assign j to pivot as pivot was low
        return pivot;
    }

    public static void main(String[] args) {
        int[] arr = DataUtils.testArr;

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
