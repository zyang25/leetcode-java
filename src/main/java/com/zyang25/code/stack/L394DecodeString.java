package com.zyang25.code.stack;

import java.util.Stack;

// s = "3[a]2[bc]", return "aaabcbc".
// s = "3[a2[c]]", return "accaccacc".
// s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.decodeString("2[abc]3[cd]ef"));
    }

    public String decodeString(String s) {
        Stack<String> sk = new Stack<String>();

        for(Character c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                sk.push(c.toString());
            } else if(c == '[') {
                sk.push(c.toString());
            } else if(c == ']') {
                String r = "";

                while(sk.size() > 0 && !sk.peek().toString().equals("[")) {
                    String cc = sk.pop();
                    r = cc + r;
                }

                sk.pop();
                
                String rr = "";
                String cn = "";

                while(sk.size() > 0 && isNumber(sk.peek())) {
                    cn = sk.pop() + cn;
                }
                
                if(cn == "")
                    continue;

                int num = Integer.parseInt(cn);
                while(num > 0) {
                    rr += r;
                    num--;
                }
                if(rr != "")
                    sk.push(rr.toString());
            } else {
                sk.push(c.toString());
            }
        }

        String result = "";
        while(sk.size() > 0) {
            result = sk.pop() + result;
        }
        
        return result;
    }

    private boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}