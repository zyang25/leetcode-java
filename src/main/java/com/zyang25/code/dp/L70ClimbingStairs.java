package com.zyang25.code.dp;

import java.util.HashMap;

class L70ClimbingStairs {
    public static void main(String[] args) {
        L70ClimbingStairs app = new L70ClimbingStairs();
        System.out.println(app.climbStairs(45));
    }

    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        return climb(n);
    }
    
    private int climb(int n) {
        if(n == 0)
            return 1;

        if(n < 0)
            return 0;
        
        // if(map.containsKey(n)){
        //     if((int)map.get(n) == n - step)
        //         return 0;
        //     else if((int)map.get(n) == n - step)
        //         return 0;
        // }
        // if(n-step >= 0)
        //     map.put(n, n-step);
        return climb(n - 1) + climb(n - 2);
    }
}
