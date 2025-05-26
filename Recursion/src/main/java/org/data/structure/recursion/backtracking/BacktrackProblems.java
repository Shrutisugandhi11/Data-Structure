package org.data.structure.recursion.backtracking;

/**
 * BackTraking is basically calling the function first and placing the output/resultant after that.
 * So,that output  or result processing happens during when the funtion returns.
 * f(x);
 * print(x);
 * */
public class BacktrackProblems {
    //1. Printing 1 to N using backtack
    public static void print1toN(int N){
        if(N<1){
            return;
        }
        print1toN(N-1);
        System.out.println(N);

    }
    public static void printNto1(int N,int num){
        if(num>N){
            return;
        }
        printNto1(N,num+1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        print1toN(5);
        printNto1(5,1);
    }
}
