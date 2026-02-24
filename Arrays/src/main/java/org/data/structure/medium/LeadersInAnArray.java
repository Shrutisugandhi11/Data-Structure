package org.data.structure.medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    public static List<Integer> leaderArrayBruteFroce(int[] lead) {
        int len = lead.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            boolean leader = true;
            for (int j = i + 1; j < len; j++) {
                if (lead[i] >= lead[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader)
                res.add(lead[i]);


        }
        return res;
    }

    public static List<Integer> leaderArray(int[] lead) {
        int len = lead.length;
        int maxSoFar = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        for (int i = len - 1; i >= 0; i--) {
            if (maxSoFar < lead[i]) {
                res.add(lead[i]);
                maxSoFar = lead[i];
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] leaders = {10, 22, 12, 3, 0, 6};
        System.out.println(leaderArray(leaders));
    }
}
