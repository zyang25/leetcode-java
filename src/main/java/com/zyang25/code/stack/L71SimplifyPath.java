package com.zyang25.code.stack;

import java.util.Stack;

public class L71SimplifyPath {
	public static void main(String[] args) {
		L71SimplifyPath solution = new L71SimplifyPath();
		System.out.println(solution.simplifyPath("/abc/.../"));
	}
	
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        
        String[] data = path.split("/");
            	
    	for (String e : data) {    		
    		if(e.equals("..") && !s.isEmpty()) {
    			s.pop();
    			continue;
    		}
    		
    		if(!e.equals("") && !e.equals("..") && !e.equals("."))
    			s.push(e);
		}
    	    	
    	String result = "";
    	
    	if(s.isEmpty())
    		return "/";
    	
        for (Object r : s.toArray()) {
			result += "/" + r;
		}
        
        return result;
    }
}
