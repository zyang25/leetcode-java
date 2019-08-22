package com.zyang25.code.array;

class L414ThirdMaximumNumber {
    public static void main(String[] args) {
        L414ThirdMaximumNumber app = new L414ThirdMaximumNumber();
        System.out.println(app.thirdMax(new int[]{2,2,3,1}));
    }

    public int thirdMax(int[] nums) {
        long one=-Long.MAX_VALUE;
    	long two=-Long.MAX_VALUE;
    	long three=-Long.MAX_VALUE;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]>one) {
    			three=two;
    			two=one;
    			one=nums[i];
    		}else if(nums[i]>two&&nums[i]<one) {
    			three=two;
    			two=nums[i];
    		}else if(nums[i]>three&&nums[i]<two)
    			three=nums[i];
    	}
    	if(three==-Long.MAX_VALUE) return (int)one;
    	else return (int)three;
    }
}