package org.data.structure.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static int[] rearrangeArrayBruteForce(int[] nums) {
        int len = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0)
                pos.add(num);

            else
                neg.add(num);
        }

        int i = 0;
        int j = 0;
        int k = 0;
        boolean flag = true;
        while (i < pos.size() && j < neg.size()) {
            if (flag) {
                nums[k] = pos.get(i);
                i++;
            } else {
                nums[k] = neg.get(j);
                j++;
            }
            k++;
            flag = !flag;
        }
        return nums;

    }

    public static int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int posIdx = 0;
        int negIdx = 1;
        for (int num : nums) {
            if (num > 0) {
                result[posIdx] = num;
                posIdx += 2;
            } else {
                result[negIdx] = num;
                negIdx += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] res = rearrangeArray(nums);

        System.out.println(
                Arrays.toString(res)
        );
    }
}
