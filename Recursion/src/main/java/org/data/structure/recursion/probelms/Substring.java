package org.data.structure.recursion.probelms;

import java.util.ArrayList;
import java.util.List;

/**
 * Program  to print subsequences of given array using recursion and backtrack
 */
public class Substring {
    public static void printSubstring(int start, int end, int[] a, List<Integer> ds) {
        if (start == end) {
            ds.forEach(System.out::print);
            System.out.println();
            return;
        }
        ds.add(a[start]);
        printSubstring(start+1,end,a,ds);
        ds.remove(ds.size()-1);
        printSubstring(start+1,end,a,ds);
    }

    public static void main(String[] args) {
        printSubstring(0,4,new int[]{1,2,3,4},new ArrayList<>());
    }
}
