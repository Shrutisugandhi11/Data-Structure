package org.data.structure.easy;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static List<Integer> unionArray(int[] nums1, int[] nums2) {
        List<Integer> union = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        while (i <= n1 || j <= n2) {
            if (nums1[i] <= nums2[j]) {
                if (union.isEmpty() || !union.contains(nums1[i])) {
                    union.add(nums1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || !union.contains(nums2[j])) {
                    union.add(nums2[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (union.isEmpty() || !union.contains(nums1[i]))
                union.add(nums1[i]);
            i++;
        }
        while (j < n2) {
            if (union.isEmpty() || !union.contains(nums2[j]))
                union.add(nums2[j]);
            j++;

        }
        return union;

    }

    public static void main(String[] args) {

    }
}
