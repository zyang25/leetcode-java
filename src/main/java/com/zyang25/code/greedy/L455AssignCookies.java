package com.zyang25.code.greedy;
import java.util.Arrays;

class L455AssignCookies {
    public static void main(String[] args) {
        L455AssignCookies app = new L455AssignCookies();
        app.findContentChildren(new int[]{3,2}, new int[]{1,2,3});
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int count  = 0;

        // [1,2], [1,2,3]
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
                count++;
            } else
                j++;
        }
        return count;
    }
}