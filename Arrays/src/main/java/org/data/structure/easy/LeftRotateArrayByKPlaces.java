package org.data.structure.easy;

import java.util.Arrays;
//Check right rotate
public class LeftRotateArrayByKPlaces {
    //Brute Force
    public static void rotatArray(int[] num) {
        int temp = num[0];
        for (int i = 1; i < num.length; i++) {
            num[i - 1] = num[i];
        }
        num[num.length - 1] = temp;

    }

    public static int[] rotateArrayByKPlacesBrute(int[] num, int K) {
        while (K != 0) {
            rotatArray(num);
            K--;
        }
        return num;
    }

    public static void reverse(int[] num, int start, int end) {
        while (start <= end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rotateArrayByKPlacesOptimal(int[] num, int k){
        reverse(num,0,k-1);
        reverse(num,k, num.length-1);
        reverse(num,0,num.length-1);

        return num;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int[] numOp={1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateArrayByKPlacesBrute(num, 3)));
        System.out.println(Arrays.toString(rotateArrayByKPlacesOptimal(numOp, 3)));

    }
}
