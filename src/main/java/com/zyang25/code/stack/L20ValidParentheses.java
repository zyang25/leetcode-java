package com.zyang25.code.stack;

import java.util.Stack;

class L20ValidParentheses {
    public static void main(String[] args) {
        L20ValidParentheses app = new L20ValidParentheses();
        System.out.println(app.isValid("()"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(stack.size() != 0 && stack.peek() == '(' && c == ')')
                stack.pop();
            else if(stack.size() != 0 && stack.peek() == '{' && c == '}')
                stack.pop();
            else if(stack.size() != 0 && stack.peek() == '[' && c == ']')
                stack.pop();
            else
                stack.push(c);
        }
        if(stack.size() > 0)
            return false;
        return true;
    }
}