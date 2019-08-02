package com.zyang25.code.string;

import java.util.HashMap;

public class L387FirstUniqueCharacterinaString {
    public static void main(String[] args){
        L387FirstUniqueCharacterinaString s = new L387FirstUniqueCharacterinaString();

        System.out.println(s.firstUniqChar("leetcode"));
        System.out.println(s.firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        int i = -1;

        for (Character c : s.toCharArray()) {
            if (m.get(c) == null)
                m.put(c, 1);
            else
                m.put(c, m.get(c) + 1);
        }

        for (Character c : s.toCharArray())
            if(m.get(c) == 1) {
                i = s.indexOf(c);
                break;
            }

        return i;
    }
}
