package org.data.structure.recursion.probelms;

import java.util.ArrayList;
import java.util.List;

public class PrintCountOfSubsequenceSumK {
    public static int countSubsequenceWithSumK(List<Integer> list, int start, int end, int[] arr, int sum, int counter) {
        if (start == end) {
            if (sum == counter) {
                list.stream().forEach(System.out::print);
                return 1;
            }
            return 0;
        }
        list.add(arr[start]);
        counter += arr[start];
        int left = countSubsequenceWithSumK(list, start + 1, end, arr, sum, counter);
        list.remove(list.size() - 1);
        counter -= arr[start];
        int right = countSubsequenceWithSumK(list, start + 1, end, arr, sum, counter);

        return left + right;

    }

    public static void main(String[] args) {
        int sumK = countSubsequenceWithSumK(new ArrayList<>(), 0, 5, new int[]{1, 2, 3, 4,1}, 3, 0);
        System.out.println(sumK);
    }
}
