package org.data.structure.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> pascalsTriangle(int numRows) {

        List<List<Integer>> pascalTriangle = new ArrayList<>();
        List<Integer> row0 = new ArrayList<>(List.of(1));

        pascalTriangle.add(row0);


        for (int i = 1; i < numRows; i++) {
            List<Integer> prevItem = pascalTriangle.get(i - 1);
            pascalTriangle.add(formRow(prevItem));
        }


        return pascalTriangle;
    }

    public static List<Integer> formRow(List<Integer> prevItem) {

        List<Integer> newItem = new ArrayList<>();

        newItem.add(1);


        for (int i = 1; i < prevItem.size(); i++) {
            newItem.add(prevItem.get(i) + prevItem.get(i - 1));
        }

        newItem.add(1);

        return newItem;
    }

    public static void main(String[] args) {

        List<List<Integer>> pascalTriangle = pascalsTriangle(5);
        for (List<Integer> item : pascalTriangle) {
            System.out.println(Arrays.toString(item.toArray()));
        }

    }
}
