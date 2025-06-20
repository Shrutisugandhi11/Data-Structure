package SortingTechniques;

import Utilites.DataUtils;

import java.util.Arrays;

/**
 * Bubble Sort:
 * swap the adjacent element till it is at the correct position
 * select element,compare with adjacent,and swap if required
 * TC:(O(N^2))
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr, int N) {
        for (int i = 0; i < N - 1; i++) {

            boolean flag = false;
            for (int j = 0; j < N - i - 1; j++) {
                //Comparing adjacent elements
                if (arr[j] > arr[j + 1]) {
                    //swap the elements
                    DataUtils.swap(arr, j, j + 1);
                    flag = true;
                }
            }
            //check if the elements are already sorted and no swaps are happening
            if (!flag) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        Arrays.stream(bubbleSort(DataUtils.sortedArr, DataUtils.sortedArr.length))
                .forEach(s -> System.out.print(s + ","));
    }

}
