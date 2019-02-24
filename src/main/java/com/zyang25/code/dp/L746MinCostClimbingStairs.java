package com.zyang25.code.dp;

import java.util.stream.IntStream;

class L746MinCostClimbingStairs {
    public static void main(String[] args) {
        L746MinCostClimbingStairs app = new L746MinCostClimbingStairs();
        System.out.println(app.minCostClimbingStairs(new int[]{0, 0, 1, 1}));
    }

    //[1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length + 1;
        int[] dp = new int[length];
        dp[0] = 0;
        dp[1] = 0;

        for(int i = 2; i < length; i++) {
            dp[i] = Math.min(cost[i-2] + dp[i-2], cost[i-1] + dp[i-1]);
        }

        return dp[length-1];
    }
}