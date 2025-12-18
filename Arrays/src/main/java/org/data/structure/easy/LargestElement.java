package org.data.structure.easy;

public class LargestElement {
    public static int firstLargest(int[] arr){
        int maxEle=Integer.MIN_VALUE;
        for (int i:arr){
            if(i>maxEle)
                maxEle=i;
        }
        return maxEle;
    }

    public static void main(String[] args) {
        int[] testArr = {-1, 2, 33, 2, 18, 7, 0, 10};
        System.out.println("Largest element:"+ firstLargest(testArr));
    }
}
