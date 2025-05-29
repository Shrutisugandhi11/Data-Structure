package org.data.structure.recursion.basics;

public class RecursionProblem3 {
    /**
     * 1.reverse a array using recursion
     */
    public static void reverseArray(int arr[], int start, int end) {
        if (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    /**
     *2.Check if string is palindrome or not.
     */
    public static boolean isPalindrome(String string,int start,int end){

        if(start>=end/2) return true;
        if(string.charAt(start)!=string.charAt(end-start-1)) return false;
        return isPalindrome(string, start+1, end);
    }

    /**
     * 3.Fibonacii series
     */
    public static int fibonaciiSeries(int N){
        if (N<=1) return N;
        return fibonaciiSeries(N-1)+fibonaciiSeries(N-2);
    }
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArray(arr, 0, 4);
        for(int i:arr){
            System.out.println(""+i+", ");
        }
        System.out.println(isPalindrome("shrutiiturhs",0,12));

         System.out.println(fibonaciiSeries(4));
    }
}
