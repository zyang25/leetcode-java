package com.zyang25.code.math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        Set<Integer> track = new HashSet<>();

        while (n > 1) {
            int total = 0;

            //115
            while (n > 0) {
                int y = n % 10;
                total += y * y;
                n = n/10;
            }

            if(track.contains(total))
                return false;
            else
                track.add(total);

            n = total;
        }

        return true;
    }
}
