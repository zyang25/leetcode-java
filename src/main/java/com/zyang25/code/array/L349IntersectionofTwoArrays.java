package com.zyang25.code.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> r = new HashSet<Integer>();
        Set<Integer> s = new HashSet<Integer>();
        
        for(int i : nums1)
            s.add(i);
        
        for(int i : nums2) {
            if(s.contains(i)) {
                r.add(i);
            }
        }
        int[] result = new int[r.size()];

        int c = 0;

        Iterator<Integer> it = r.iterator();
        while(it.hasNext()) {
            int i = it.next();
            result[c] = i;
            c++;
        }

        return result;
    }
}