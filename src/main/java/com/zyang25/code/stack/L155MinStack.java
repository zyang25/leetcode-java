package com.zyang25.code.stack;

import java.util.Stack;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/
public class L155MinStack {
	public static void main(String[] args) {
		L155MinStack app = new L155MinStack();
		
		MinStack minStack = app.getInstance();
		
		minStack.push(512);
		minStack.push(-1024);
		minStack.push(-1024);
		minStack.push(512);
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
	}
	
	public MinStack getInstance() {
		return new MinStack();
	}
	
	public class MinStack {
		private Stack<Integer> dataStack;
		
		private Stack<Integer> minStack;
		
		/** initialize your data structure here. */
	    public MinStack() {
	        dataStack = new Stack<>();
	        minStack = new Stack<>();
	    }
	    
	    public void push(int x) {
	        dataStack.push(x);
	        
	        if(minStack.isEmpty() || x <= minStack.peek())
	        	minStack.push(x);
	    }
	    
	    public void pop() {
	    	if(minStack.peek().equals(dataStack.peek()))
	        	minStack.pop();

	    	dataStack.pop();
	    }
	    
	    public int top() {
			return dataStack.peek();
	    }
	    
	    public int getMin() {
			return minStack.peek();
	    }
	}
}
