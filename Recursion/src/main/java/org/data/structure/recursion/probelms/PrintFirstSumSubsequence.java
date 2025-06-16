package org.data.structure.recursion.probelms;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstSumSubsequence {
    public static boolean kthFirstSumSubsequence(List<Integer> list, int start, int end, int[] arr, int sum, int counter) {
        if (start == end) {
            if (sum == counter) {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[start]);
        counter += arr[start];
        if (kthFirstSumSubsequence(list, start+1, end, arr, sum, counter)) return true;
        list.remove(list.size() - 1);
        counter -= arr[start];
        if (kthFirstSumSubsequence(list, start+1, end, arr, sum, counter)) return true;


        return false;
    }

    public static void main(String[] args) {
        kthFirstSumSubsequence(new ArrayList<>(),0,4,new int[]{1,2,3,4},5,0);
    }
}
