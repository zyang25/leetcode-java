package com.zyang25.code.stack;

import java.util.Stack;

/**
 * Use 2 stacks for calculation
 * Stack 1 will valid the parenthese
 * Stack 2 will keep track the index and value of that parenthese
 * For Stack 1 and 2 they both use index of the array of tracking
 */
public class L856ScoreOfParentheses {
	public static void main(String[] args) {
		L856ScoreOfParentheses app = new L856ScoreOfParentheses();
		System.out.println(app.scoreOfParentheses(new String("(()(()))")));
	}
	
	public int scoreOfParentheses(String S) {
		Stack<Integer> s1 = new Stack<>();
		Stack<int[]> s2 = new Stack<>();
		char[] chs = S.toCharArray();
		int r = 0;

		for(int i = 0; i < S.length(); i++) {
			if(s1.size() > 0 && chs[s1.peek()] == '(' && chs[i] == ')') {
				if(i - s1.peek() == 1) {
					s2.push(new int[]{i, 1});
				} else {
					int tmpR = 0;
					while ( s2.size() > 0 && s2.peek()[0] > s1.peek() ) {
						tmpR += s2.peek()[1];
						s2.pop();
					}
					tmpR *= 2;
					s2.push(new int[]{i, tmpR});
				}
				s1.pop();
			} else
				s1.push(i);
		}

		while(s2.size() > 0) {
			r += s2.peek()[1];
			s2.pop();
		}

		return r;
    }
}
