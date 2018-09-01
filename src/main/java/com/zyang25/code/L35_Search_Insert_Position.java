package com.zyang25.code;

import java.util.SortedSet;
import java.util.TreeSet;

public class L35_Search_Insert_Position {
	
	public static class Solution {

		public int searchInsert(int[] nums, int target) {
	    	SortedSet<Integer> r = new TreeSet<>();
	    	
	    	for(int n : nums){
	    		r.add(n);
	    	}
	    	
	    	if(r.contains(target))
	    		return r.headSet(target).size();
	    		
	    	
			return target;
	    }
	}

	public static void main(String[] args) {

	}
}
