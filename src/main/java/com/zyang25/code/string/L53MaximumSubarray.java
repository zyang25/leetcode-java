package com.zyang25.code.string;

//Input: [-2,1,-3,4,-1,2,1,-5,4],
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
public class L53MaximumSubarray {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int localMax = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            res = Math.max(res, localMax);
        }

        return res;
    }
}
