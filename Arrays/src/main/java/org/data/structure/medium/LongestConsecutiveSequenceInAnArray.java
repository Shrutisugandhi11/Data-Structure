package org.data.structure.medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequenceInAnArray {
    public static int consecutiveArrayBrute(int[] nums) {
        int len = nums.length;
        int longestLength = 1;
        for (int i = 0; i < len; i++) {
            int X = nums[i];
            int lengthSoFar = 1;
            int nextElement = 1;
            while (linearSearch(nums, X + nextElement)) {
                lengthSoFar++;
                nextElement++;
            }
            longestLength = Math.max(longestLength, lengthSoFar);
        }
        return longestLength;
    }

    /**
     *
     * Only works for sorted array
     * This solution distors the array which is not recommended
     */

    public static int consecutiveArrayBetter(int[] nums) {
        int countLength = 0;
        int longestLength = 1;
        int smallestElement = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num - 1 == smallestElement) {
                countLength++;
                smallestElement = num;
            } else if (num != smallestElement) {
                countLength = 0;
                smallestElement = num;
            }
            longestLength = Math.max(longestLength, countLength);
        }
        return longestLength;
    }

    public static int consecutiveArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int longestCount = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longestCount = Math.max(longestCount, count);
            }
        }
        return longestCount;
    }

    public static boolean linearSearch(int[] nums, int target) {
        for (int ele : nums) {
            if (ele == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(consecutiveArray(nums));
    }
}
