package org.data.structure.learnTheBasics.pattern;

public class Pattern3 {
    /**
     * A
     * A B
     * A B C
     * A B C D
     * Pattern-13
     */
    public static void patternThirteen(int n) {
        for (int i = 0; i < n; i++) {
            int alphabet = 65;
            for (int j = 0; j < i; j++) {
                System.out.printf("%c ", alphabet++);
            }
            System.out.println();
        }
    }

    /**
     *A B C D E
     * A B C D
     * A B C
     * A B
     * A
     * Pattern-14
     */
    public static void patternFourteen(int n) {
        for (int i = n; i>0; i--) {
            int alphabet = 65;
            for (int j = i; j >0 ; j--) {
                System.out.printf("%c ", alphabet++);
            }
            System.out.println();
        }
    }

    /**
     * A
     * BB
     * CCC
     * DDDD
     * EEEEE
     * @Pattern-15
     */
    public static void patternFifteen(int n) {
        int alphabet = 65;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.printf("%c", alphabet);
            }
            alphabet+=1;
            System.out.println();
        }
    }

    /**
     *     A
     *    ABA
     *   ABCBA
     *  ABCDCBA
     * ABCDEDCBA
     * @param n
     */
    public static void patternSixteen(int n){
        for (int i = 0; i < n; i++) {
            int alphabet = 65;
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            int breakpoint=(2*i+1)/2;
            for (int j = 1; j <=2*i+1; j++) {
                System.out.printf("%c", alphabet);
                if(j<=breakpoint)
                alphabet++;
                else
                alphabet--;
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * E
     * DE
     * CDE
     * BCDE
     * ABCDE
     * @param n
     */
    public static void patternSeventeen(int n){
        int alphabet=65+n-1;
        for (int i=0;i<n;i++){
            for (int j = alphabet-i; j <=alphabet ; j++) {
                System.out.printf("%c", j);

            }
            System.out.println();
        }
    }

    /**
     * **********
     * ****  ****
     * ***    ***
     * **      **
     * *        *
     *
     * *        *
     * **      **
     * ***    ***
     * ****  ****
     * **********
     * @param n
     */
    public static void patternEighteen(int n){
        int space=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j =0 ; j <space ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }


            space+=2;
            System.out.println();
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            for (int j = space; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
    }

    /**
     * *        *
     * **      **
     * ***    ***
     * ****  ****
     * **********
     * ****  ****
     * ***    ***
     * **      **
     * *        *
     * @param n
     */
    public static void patternNighteen(int n){
        int spaces=2*n-2;
        for (int i =1; i <=2*n-1; i++) {
            int stars=i;
            if(i>n)stars=2*n-i;
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<n)spaces-=2;
            else spaces+=2;

        }
    }

    /**
     *
     * *****
     * *   *
     * *   *
     * *   *
     * *****
     */
    public static void patternTwenty(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        patternThirteen(5);
        patternFourteen(5);
        patternFifteen(5);
        patternSixteen(5);
        patternSeventeen(5);
        patternEighteen(5);
        patternNighteen(5);
        patternTwenty(5);
    }
}
