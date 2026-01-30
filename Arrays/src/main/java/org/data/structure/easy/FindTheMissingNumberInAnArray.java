package org.data.structure.easy;

public class FindTheMissingNumberInAnArray {

    private static int missingNumber(int[] nums) {
        int len = nums.length;
        boolean[] missingNumber = new boolean[len+1];
        for (int i = 0; i < len; i++) {
            missingNumber[nums[i]] = true;
        }
        for (int i = 0; i < len; i++) {
            if (!missingNumber[i])
                return i;

        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
