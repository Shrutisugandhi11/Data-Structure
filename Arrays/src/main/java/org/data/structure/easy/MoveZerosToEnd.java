package org.data.structure.easy;

import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZerosToEnd {
    public static int[] moveZeros(int[] num) {
        int j = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                j = i;
                break;
            }
        }
            for (int k = j + 1; k < num.length; k++) {
                if (num[k] != 0) {
                    swap(num, k, j);
                    j++;
                }
            }


        return num;
    }

    public static void swap(int[] num, int start, int end) {
        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;
    }

    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeros(num)));
    }
}
