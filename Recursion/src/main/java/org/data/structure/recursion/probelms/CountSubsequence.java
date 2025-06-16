package org.data.structure.recursion.probelms;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequence {
    public static Integer countSubsequenceString(List<Integer> list, int start, int end, int[] arr) {
        if (start == end) {
            return 1;
        }
        list.add(arr[start]);
        int left = countSubsequenceString(list, start + 1, end, arr);
        list.remove(list.size() - 1);
        int right = countSubsequenceString(list, start + 1, end, arr);
        return left + right;
    }

    public static void main(String[] args) {
        System.out.println(countSubsequenceString(new ArrayList<>(), 0, 4, new int[]{1, 2, 3, 4}));
    }
}
