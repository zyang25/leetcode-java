package com.zyang25.code.greedy;

import java.util.Stack;

class L402RemoveKDigits {
    public static void main(String[] args) {
        L402RemoveKDigits app = new L402RemoveKDigits();
        System.out.println(app.removeKdigits("1234567890", 9));
    }

    //Input: num = "1432219", k = 3
    //Output: "1219"
    // 100 remove 1
    public String removeKdigits(String num, int k) {
        Stack<Integer> s = new Stack<>();

        for (char c : num.toCharArray()) {
            int n = Character.getNumericValue(c);
            
            while (s.size() !=0 && s.peek() > n && k != 0) {
                s.pop();
                k--;
            }

            s.push(n);
        }

        while(k > 0) {
            if(s.size() > 0){
                s.pop();
            }
            k--;
        }

        String r = "";
        for (int i : s) {
            if(r.length() == 0 && i == 0 && s.size() > 1)
                continue;
            r += i;
        }

        if(r == "")
            r = "0";

        return r;
    }
}