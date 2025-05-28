package org.data.structure.recursion.basics;

public class RecursionProblem3 {
    /**
     * 1.reverse a array using recursion
     */
    public static void reverseArray(int arr[], int start, int end) {
        if (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    /**
     *
     *
     */

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArray(arr, 0, 4);
        for(int i:arr){
            System.out.println(""+i+", ");
        }
    }
}
