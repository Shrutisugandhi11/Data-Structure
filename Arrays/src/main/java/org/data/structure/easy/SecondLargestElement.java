package org.data.structure.easy;

public class SecondLargestElement {
    public static int secondLargest(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        int secondEle = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maxEle) {
                maxEle = i;
            }
            if(i<maxEle && i>secondEle)
                secondEle=i;
        }

        return secondEle;
    }

    public static void main(String[] args) {
        int[] testArr = {10, 2, 33, 2, 18, 7, 0, 31};
        System.out.println("Second largest:" + secondLargest(testArr));
    }

}
