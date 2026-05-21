package org.data.structure.medium;

public class TwoSum {
    public static boolean isTwoSum(int[] input, int sum) {
        int len = input.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (input[i] + input[j] == sum)
                    return true;
            }

        }
        return false;
    }
}
