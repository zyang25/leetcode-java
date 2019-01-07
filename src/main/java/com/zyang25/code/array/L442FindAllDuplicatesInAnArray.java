//Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements that appear twice in this array.
//
//Could you do it without extra space and in O(n) runtime?
//
//Example:
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[2,3]
package com.zyang25.code.array;

import java.util.ArrayList;
import java.util.List;

public class L442FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
    	List<Integer> r = new ArrayList<>();
    	
		for(int i = 0;i < nums.length; i++) {
			int mapping = nums[Math.abs(i)];
			
			if(nums[mapping] > 0)
				nums[i] = - nums[i];
			else
				r.add(Math.abs(nums[i]));
		}
		
		return r;
    }
    
	public static void main(String[] args) {
		L442FindAllDuplicatesInAnArray s = new L442FindAllDuplicatesInAnArray();
		
		s.findDuplicates(new int[] {4,3,2,7,8,2,3,1});
	}
}
