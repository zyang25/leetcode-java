package com.zyang25.code.array;

import java.util.HashMap;
import java.util.Map;

public class L884UncommonWordsfromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        String[] a = A.split(" ");
        String[] b = B.split(" ");

        Map<String, Integer> m = new HashMap<>();

        for(String s : a) {
            if(!m.containsKey(s))
                m.put(s, 0);
            else
                m.put(s, m.get(s) + 1);
        }

        for(String s : b) {
            if(m.containsKey(s)) {
            }
        }

        return null;
    }
}
