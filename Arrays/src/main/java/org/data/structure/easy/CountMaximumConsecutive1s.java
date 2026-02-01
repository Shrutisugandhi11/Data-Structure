package org.data.structure.easy;

public class CountMaximumConsecutive1s {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currSum += 1;
            } else {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
