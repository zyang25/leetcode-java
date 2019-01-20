package com.zyang25.code.stack;

public class L665NonDecreasingArray {
	public static void main(String[] args) {
		L665NonDecreasingArray app = new L665NonDecreasingArray();
		System.out.println(app.checkPossibility(new int[] {4, 2, 3}));
	}
	
	// 1 3 2 4 2 4 5
    public boolean checkPossibility(int[] nums) {
    	if(nums.length == 1)
    		return true;
    	
		int count = 0;
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < nums[i-1]) {
				if(i == 1 || nums[i] > nums[i-2])
					nums[i-1] = nums[i];
				else
					nums[i] = nums[i-1];
				count++;
			}
			
			if(count == 2)
				return false;
		}
    	
    	return true;
    }
}
