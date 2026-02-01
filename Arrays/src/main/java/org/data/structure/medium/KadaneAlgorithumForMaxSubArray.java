package org.data.structure.medium;

public class KadaneAlgorithumForMaxSubArray {
    public static int kadaneAlgorithm(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;

        }
        return max;
    }

    public static int kadaneAlgorithmBruteForce(int[] arr) {
        int len = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -3, -7, -2, -10, -4};
        System.out.println(kadaneAlgorithmBruteForce(arr));
        System.out.println(kadaneAlgorithm(arr));
    }
}
