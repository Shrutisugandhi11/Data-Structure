package org.data.structure.easy;

import java.util.HashMap;
import java.util.stream.Stream;

public class SingleOccurrenceNumber {
    private static int singleNumber(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            int num = nums[i];
//            int value = 1;
//
//            if (hashMap.containsKey(num))
//                value++;
//            hashMap.put(num, value);
//
//        }
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        int integer = hashMap.entrySet().stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getValue() < 2)
                .map(entry -> entry.getKey()).findAny().get();
        return integer;
    }

    private static int singleNumberBruteForce(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count < 2) return nums[i];

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
