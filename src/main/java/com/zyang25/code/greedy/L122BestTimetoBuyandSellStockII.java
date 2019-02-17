package com.zyang25.code.greedy;

/**
 * Iterate through the array and calculate the
 * diff between the upwards stock price range
 * draw a diagram you will see the full picture
 */
class L122BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        L122BestTimetoBuyandSellStockII app = new L122BestTimetoBuyandSellStockII();
        System.out.println(app.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        
        if(prices.length == 0 || prices.length == 1)
            return profit;

        for(int i = 1; i < prices.length; i++){
            int prev = prices[i -1];
            int curr = prices[i];

            int diff = curr - prev;

            if(diff > 0)
                profit += diff;
        }
        return profit;
    }
}