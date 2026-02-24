package org.data.structure.medium;

import Utilites.DataUtils;

public class SortAnArrayOf0s_1sAnd2s {
    public void sortColorsBruteForce(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num == 0)
                count0++;
            if (num == 1)
                count1++;
            if (num == 2)
                count2++;
        }
        for (int i = 0; i <= count0; i++)
            nums[i] = 0;

        for (int i = count0; i <= count1; i++)
            nums[i] = 1;
        for (int i = count0 + count1; i <= count2; i++)
            nums[i] = 2;


    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                DataUtils.swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                DataUtils.swap(nums, high, mid);
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};


    }
}

