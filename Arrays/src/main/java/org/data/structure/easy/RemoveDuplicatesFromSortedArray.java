package org.data.structure.easy;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

    //Brute Force
    public static int removeDuplicateInPlace(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;
        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
                nums[index++] = num;

            }

        }
        return index;
    }
    //Opitmal using two pinters
    public static int removeDuplicateInPlaceOptimal(int[] nums){
        int i=0;
        int j=1;

        while (j<nums.length) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] testArr = {1,1,2};
       // System.out.println(removeDuplicateInPlace(testArr));
        System.out.println(removeDuplicateInPlaceOptimal(testArr));
    }
}
