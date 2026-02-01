package org.data.structure.medium;

public class StockBuyAndSell {
    private static int buyAndSell(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < len; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }

    private static int buyAndSellBruteForce(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < len; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < len; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - buy);
            }

        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {1,4,2};
        System.out.println(buyAndSell(prices));
    }
}
