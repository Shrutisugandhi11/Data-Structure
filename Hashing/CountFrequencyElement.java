package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1, 1, 2, 3, 4, 5, 0};

        int[] frequency = new int[arr.length];
        //use map to avoid duplicate values
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]] += 1;
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Frequency of:" + arr[i] + " is " + frequency[arr[i]]);
        }
        System.out.println("*".repeat(10));

        for (Map.Entry<Integer, Integer> mapEntries : frequencyMap.entrySet()) {
            System.out.println(mapEntries.getKey() + "::::::" + mapEntries.getValue());
        }

    }
}
