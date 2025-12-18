package org.data.structure.easy;

/*
Modular operator for circular datastructures, It helps to play with indexes easier.
(i+1)% arr.length
 */
public class CheckIfArrayIsSorted {
    public static boolean isArraySorted(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[(i + 1) % arr.length]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] testArr = {-1, 2, 3, 12, 18, 27, 30, 100};
        System.out.println(isArraySorted(testArr));
    }
}
