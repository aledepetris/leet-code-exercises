package com.aledepetris.roadmap.algomap.stringsarrays;

/**
 * 121. Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
 * in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class SellAndBuyStock {

    public int maxProfit(int[] prices) {

        int size = prices.length;
        int maxProfit = 0;
        int min = prices[0];

        for (int i = 1; i < size; i++) {
            if(prices[i] > min) {
                int profit = prices[i] - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                min = prices[i];
            }
        }

        return maxProfit;
    }

}
