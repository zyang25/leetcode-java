package com.zyang25.code.stack;

import java.util.HashMap;
import java.util.Stack;

public class L496NextGreaterElementI {

	public static void main(String[] args) {
		L496NextGreaterElementI app = new L496NextGreaterElementI();
		app.nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2});
	}

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	if(nums1.length == 0)
    		return new int[] {};
    	
    	Stack<Integer> s = new Stack<>();
    	HashMap<Integer, Integer> m = new HashMap<>();
    	for (int e : nums2) {
			while(!s.isEmpty() && s.peek() < e) {
				m.put(s.peek(), e);
				s.pop();
			}
			
			s.push(e);
		}
    	
    	int[] r = new int[nums1.length];
       	for (int i = 0; i< nums1.length; i++) {
    		int e = nums1[i];
    		
//			if(m.get(e) == null)
//				r[i] = -1;
//			else
//				r[i] = m.get(e);
			
 			r[i] = m.get(e) == null ? -1 : m.get(e);
		}
    	
		return r;
    }
}
