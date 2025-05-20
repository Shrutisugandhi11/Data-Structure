package org.data.structure.learnTheBasics.pattern;

//Contains basic pattern printing problems using loops


public class Pattern1 {
    /*
    ------Pattern-1--------
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    public static void patternOne(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    /*
     ------Pattern-2--------
     *
     * *
     * * *
     * * * *
     */
    public static void patternTwo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    /*
    ------Pattern-3--------
    1
    22
    333
    4444
    55555

*/
    public static void patternThree(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
    /*
        ------Pattern-4--------
        1
        1 2
        1 2 3
        1 2 3 4
    */
    public static void patternFour(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    /*
    ------Pattern-3--------
        * * * * *
        * * * *
        * * *
        * *
        *
*/
    public static void patternFive(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
 ------Pattern-3--------
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
*/
    public static void patternSix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternOne(5);
        patternTwo(5);
        patternThree(5);
        patternFour(5);
        patternFive(5);
        patternSix(5);
    }
}