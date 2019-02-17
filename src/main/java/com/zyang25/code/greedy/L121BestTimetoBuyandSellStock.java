package com.zyang25.code.greedy;

/**
 * Iterate the price list, compare the price with 
 * the lowest price before this
 */
class L121BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        L121BestTimetoBuyandSellStock app = new L121BestTimetoBuyandSellStock();
        System.out.println(app.maxProfit(new int[]{7,1,5,3,0,10}));
    }

    //Input: [7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;

        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;

        for(int p : prices) {
            min = Integer.min(min, p);
            profit = Integer.max(profit, p - min);
        }
        return profit;
    }
}