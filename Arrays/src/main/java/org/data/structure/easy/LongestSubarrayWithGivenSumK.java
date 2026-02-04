package org.data.structure.easy;

public class LongestSubarrayWithGivenSumK {
    private static int longestSubarray(int[] nums, int K) {
        int length = nums.length;
        int maxLen = 0;
        for (int i = 0; i < length; i++) {
            int len = 0, sum = 0;
            for (int j = i; j < length; j++) {
                sum += nums[j];
                len++;
                if (sum == K && len > maxLen) {
                    maxLen = len;
                }

            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {-3, 2, 1};
        int K=6;
        System.out.println(longestSubarray(nums, K));
    }
}
