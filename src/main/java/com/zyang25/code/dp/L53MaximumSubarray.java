package com.zyang25.code.dp;

class L53MaximumSubarray {
    public static void main(String[] args) {
        L53MaximumSubarray app = new L53MaximumSubarray();
        System.out.println(app.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    
    //[-2,1,-3,4,-1,2,1,-5,4]
    public int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return 0;

        int i = 1;
        int max = nums[0];
        int prevSum = nums[0];

        while (i < nums.length) {
            int s = Math.max(nums[i], prevSum + nums[i]);
            prevSum = s;

            if(s > max)
                max = s;
            i++;
        }
        return max;
    }
}