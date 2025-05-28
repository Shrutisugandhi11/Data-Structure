package org.data.structure.recursion.basics;

public class RecursionProblem2 {
    /**
     * sum of N numbers
     **/
    public static int sumNumbers(int n) {
        if (n == 0)
            return 0;
        return sumNumbers(n - 1) + n;
    }
    /**
     * Factorial of n number
     */
    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(15));
        System.out.println(factorial(5));
    }
}
