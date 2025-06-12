package org.data.structure.recursion.probelms;

import java.util.ArrayList;
import java.util.List;

public class SumSubsequence {
    public static void kthSumSubsequence(List<Integer>list, int start, int end, int[]arr,int sum,int counter){
        if(start==end) {
            if(counter ==sum) {
                list.forEach(System.out::print);
                System.out.println();
            }
            return;
        }

        list.add(arr[start]);
        counter+=arr[start];
        kthSumSubsequence(list,start+1,end,arr,sum,counter);
        list.remove(list.size()-1);
        counter-=arr[start];
        kthSumSubsequence(list,start+1,end,arr,sum,counter);
    }
    public static void main(String[] args) {
        kthSumSubsequence(new ArrayList<>(),0,4,new int[]{1,2,3,4},5,0);

    }
}
