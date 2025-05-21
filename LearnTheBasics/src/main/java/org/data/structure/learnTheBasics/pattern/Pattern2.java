package org.data.structure.learnTheBasics.pattern;

public class Pattern2 {
    /**
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     * Pattern-7
     */
    public static void patternSeven(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    /**
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     * Pattern-8
     */
    public static void patternEight(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    /**
     * *
     * **
     * ***
     * ****
     * *****
     * ******
     * *****
     * ****
     * ***
     * **
     * *
     * Pattern-9
     */
    public static void patternNine(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int stars = i;
            if (n < i) stars = 2 * n - i;
            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    /**
     * 1
     * 01
     * 101
     * 0101
     * 10101
     * Pattern-10
     */

    public static void patternTen(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) num = 1;
            else num = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println();
        }
    }

    /**
     * 1        1
     * 12      21
     * 123    321
     * 1234  4321
     * 1234554321
     * Patten-11
     */
    public static void patternEleven(int n) {
        int space=2*(n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);

            }

            System.out.println();

            space-=2;
        }
    }
    /*

     */
    public static void patternTwelve(int n) {
        int num=0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++num+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        patternSeven(5);
        patternEight(5);
        patternNine(5);
        patternTen(5);
        patternEleven(5);
        patternTwelve(5);
    }
}
