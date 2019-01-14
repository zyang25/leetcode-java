package com.zyang25.code.stack;

import java.util.Stack;

public class L946ValidateStackSequences {
	public static void main(String[] args) {
		L946ValidateStackSequences s = new L946ValidateStackSequences();
		System.out.println(s.validateStackSequences(new int[] {1,0}, new int[] {1,0}));
	}
	
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		if(pushed.length == 0 || popped.length == 0)
			return true;
		
		Stack<Integer> s = new Stack<>();
		
		int c1 = 0;
		int c2 = 0;

		while(c1 < pushed.length || c2 < popped.length) {			
			if(s.isEmpty() || s.peek() != popped[c2]) {
				if(c1 >= pushed.length)
					return false;
				
				s.push(pushed[c1]);
				c1++;
			} else if(s.peek() == popped[c2]) {
				if(c2 >= popped.length)
					return false;
				
				s.pop();
				c2++;
			}
		}
		
		return true;
    }
}
