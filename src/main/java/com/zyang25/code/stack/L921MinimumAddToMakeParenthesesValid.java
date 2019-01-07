package com.zyang25.code.stack;

import java.util.Stack;

public class L921MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
    	Stack<Character> s = new Stack<>();
    	
		for(int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			
			if(!s.isEmpty() && c == ')' && s.peek() == '(')
				s.pop();
			else
				s.push(c);
		}
		return s.size();
    }
	
	public static void main(String[] args) {
	}
}
