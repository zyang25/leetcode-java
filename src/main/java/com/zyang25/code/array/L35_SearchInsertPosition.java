package com.zyang25.code.array;

/*
 *  Example 1:

	Input: [1,3,5,6], 5
	Output: 2
	Example 2:
	
	Input: [1,3,5,6], 2
	Output: 1
	Example 3:
	
	Input: [1,3,5,6], 7
	Output: 4
	Example 4:
	
	Input: [1,3,5,6], 0
	Output: 0
	
 * */
public class L35_SearchInsertPosition {
	
	public static class Solution {

		public static int searchInsert(int[] nums, int target) {
	    	if(nums.length == 0)
	    		return 0;
	    	
	    	int r = 0;
	    	
	    	for(int i = 0; i < nums.length; i++) {
	    		if(target <= nums[i]) {
	    			if(target == nums[i]) {
	    				r = i;
	    				break;
	    			}
	    			else if(target < nums[i]){
	    				r = i - 1;
	    				break;
	    			}
				}else {
					r = i + 1;
					break;
				}
	    	}
	    	return r;
	    }
	}

	public static void main(String[] args) {
		
	}
}