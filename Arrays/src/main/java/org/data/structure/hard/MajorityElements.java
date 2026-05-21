package org.data.structure.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements {


    public static List<Integer> majorityElements(int[] elements) {

        HashMap<Integer, Integer> majorityMap = new HashMap<>();
        List<Integer> majorityList = new ArrayList<>();

        int size = elements.length;
        int occurencce = size / 3 + 1;


        for (int element : elements) {
            majorityMap.put(element, majorityMap.getOrDefault(element, 0) + 1);

            if (majorityMap.get(element) == occurencce)
                majorityList.add(element);
        }


        return majorityList;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 1, 3, 2};
        int[] elements = {1, 2, 1, 1, 3, 2, 2};

        System.out.println(majorityElements(nums));
        System.out.println(majorityElements(elements));


        System.out.println();
    }
}
