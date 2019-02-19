package com.zyang25.code.stack;

import java.util.Stack;

public class L856ScoreOfParentheses {
	public static void main(String[] args) {
		L856ScoreOfParentheses app = new L856ScoreOfParentheses();
		System.out.println(app.scoreOfParentheses(new String("(()(()))")));
	}
	
	public int scoreOfParentheses(String S) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		char[] chs = S.toCharArray();
		int r = 0;

		for(int i = 0; i < S.length(); i++) {
			if(s1.size() > 0 && chs[s1.peek()] == '(' && chs[i] == ')') {
				if(i - s1.peek() == 1) {
					s2.push(i);
				} else {
					int tmpR = 0;
					while ( s2.size() > 0 && s2.peek() > s1.peek() ) {
						tmpR += 1;
						s2.pop();
					}
					tmpR *= 2;
					r += tmpR;
				}
				s1.pop();
			} else
				s1.push(i);
		}

		while(s2.size() > 0) {
			r += 1;
			s2.pop();
		}

		return r;
    }
}
