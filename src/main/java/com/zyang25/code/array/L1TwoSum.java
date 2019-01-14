package com.zyang25.code.array;

import java.util.HashMap;
import java.util.HashSet;

// 2 11 7 15 target 27
public class L1TwoSum {
	public static void main(String[] args) {
		
	}
	
    public int[] twoSum(int[] nums, int target) {
    	if(nums.length == 2)
    		return new int[]{0, 1};
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i< nums.length; i++) {
			if(map.containsKey(nums[i]))
				return new int[] {map.get(nums[i]),i};
			else
				map.put(target-nums[i], i);
		}
    	
    	return new int[]{0,0};
    }
}
