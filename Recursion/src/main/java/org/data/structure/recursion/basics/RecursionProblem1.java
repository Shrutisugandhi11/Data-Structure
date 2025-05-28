package org.data.structure.recursion.basics;

public class RecursionProblem1 {
    /**
     * Write a function to print a string n times
     * @param args
     */
    public static void printName(int n,String string){
        if(n==0)
            return;
        System.out.println("Printing name for "+n+" th time: " +string);
        printName(--n,string);
    }

    /**
     * prints linear numbers from 1 to N
     * @param 
     */
    public static void printNumber1toN(int N,int num){

        if(num>N)
            return;
        System.out.println(num);

        printNumber1toN(N,++num);
    }

    /**
     * prints linear numbers from N to 1
     * @param N
     */
    public static void printNumberNto1(int N) {
    if(N==0)
        return;
        System.out.println(N);
        printNumberNto1(--N);
    }
    public static void main(String[] args) {
        printName(5,"Shruti");
        printNumber1toN(5,1);
        printNumberNto1(5);
    }
}
