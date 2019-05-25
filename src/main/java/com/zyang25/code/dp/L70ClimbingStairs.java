package com.zyang25.code.dp;

import java.util.HashMap;
import java.util.Map;

class L70ClimbingStairs {
    public static void main(String[] args) {
        L70ClimbingStairs app = new L70ClimbingStairs();
        System.out.println(app.climbStairs(45));
    }

    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        return climb(n, map);
    }
    
    private int climb(int n, HashMap<Integer,Integer> m) {
        if(n == 0)
            return 1;

        if(n < 0)
            return 0;
        if(!m.containsKey(n)){
            int r = climb(n - 1, m) + climb(n - 2, m);
            m.put(n, r);
            return r;
        } else
            return (int)m.get(n);
    }
}
