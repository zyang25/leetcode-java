package com.zyang25.code.string;

import com.sun.codemodel.internal.JType;

import java.util.HashSet;
import java.util.Set;

public class L771JewelsAndStones {
    public static void main(String[] args) {
        L771JewelsAndStones app = new L771JewelsAndStones();

        app.numJewelsInStones("aA", "aAAbbbb");
    }

    public int numJewelsInStones(String J, String S) {
        Set<Character> jType = new HashSet<>();

        char[] jChars = J.toCharArray();
        int jLen = jChars.length;
        while (jLen > 0) {
            jType.add(jChars[jLen-1]);
            jLen--;
        }

        char[] sChar = S.toCharArray();
        int count = 0;
        for (int i = 0; i < sChar.length; i++) {
            Character c = sChar[i];

            if(jType.contains(c))
                count++;
        }

        return count;
    }
}
