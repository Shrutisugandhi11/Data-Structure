package SortingTechniques;

import Utilites.DataUtils;

import java.util.Arrays;

import static Utilites.DataUtils.swap;

/**
 * Selection Sort:
 * We find the minimum element of the given array and
 * place it to the beginning indexes one by one
 * TC:O(N^2)
 */
public class SelectionSort {


    public static int[] selectionSort(int[] arr, int N) {
        //Looping till N-2 because for last element J+1 will cause error
        //also last element will already be at its right position
        for (int i = 0; i < N - 2; i++) {
            int minIndx = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[minIndx]) {
                    minIndx = j;
                }
            }
            //keeping the smallest element to the beginning positions
            swap(arr, i, minIndx);
        }
        return arr;
    }

    public static void main(String[] args) {

        Arrays.stream(selectionSort(DataUtils.testArr, DataUtils.testArr.length))
                .forEach(s -> System.out.print(s + ","));
    }
}
