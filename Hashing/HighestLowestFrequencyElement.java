package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequencyElement {

    //TC(O(N^2))
    public static void countHighestAndLowestFrequency(int[] arr, int N) {
        boolean[] frequency = new boolean[arr.length];
        int countMaxEle = arr[0], countMinEle = arr[0];
        int countMaxFrequency = 1, countMinFrequency = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (frequency[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = true;
                }
            }
            if (count > countMaxFrequency) {
                countMaxFrequency = count;
                countMaxEle = arr[i];

            }
            if (count < countMinFrequency) {
                countMinFrequency = count;
                countMinEle = arr[i];
            }


        }
        System.out.println(countMaxEle + "::::" + countMaxFrequency);
        System.out.println(countMinEle + "::::" + countMinFrequency);
    }

    //TC(O(N))
    public static void countHighestAndLowestFrequencyII(int[] arr, int N) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < N; i++) {

            integerMap.put(arr[i], integerMap.getOrDefault(arr[i], 0) + 1);

        }
        int countMaxEle = arr[0], countMinEle = arr[0];
        int countMaxFrequency = integerMap.get(countMaxEle);
        int countMinFrequency = integerMap.get(countMinEle);

        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            if (freq > countMaxFrequency) {
                countMaxFrequency = freq;
                countMaxEle = key;
            }

            if (freq < countMinFrequency) {
                countMinFrequency = freq;
                countMinEle = key;
            }
        }

        System.out.println(countMaxEle + "::::" + countMaxFrequency);
        System.out.println(countMinEle + "::::" + countMinFrequency);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 1, 2, 3, 4, 5, 0};
        countHighestAndLowestFrequency(arr, arr.length);
        System.out.println("*".repeat(10));
        countHighestAndLowestFrequencyII(arr, arr.length);


    }
}
