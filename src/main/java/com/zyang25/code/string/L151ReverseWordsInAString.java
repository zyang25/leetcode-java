package com.zyang25.code.string;

import java.util.Stack;

public class L151ReverseWordsInAString {
	public static void main(String[] args) {
		L151ReverseWordsInAString app = new L151ReverseWordsInAString();
		System.out.println(app.reverseWords(" 1"));
	}
	
    public String reverseWords(String s) {
    	String[] data = s.split(" ");
    	
    	Stack<String> temp = new Stack<String>();
    	for (int i = 0; i < data.length ; i++) {
			String w = data[i];
			if(!w.equals(""))
				temp.push(w);
		}
    	
    	String r = "";
    	while(!temp.isEmpty()) {
    		String w = temp.pop();
    		r += w;
    		
    		if(temp.size() != 0)
    			r += " ";
    	}
    	
    	return r;
    }
}
