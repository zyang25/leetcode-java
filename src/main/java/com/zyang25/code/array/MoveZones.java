package com.zyang25.code.array;

public class MoveZones {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0)
            return;

        int slow = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[slow] = nums[i];
                slow++;
            }
        }

        for(int i = slow; i < nums.length; i++) {
            nums[slow] = 0;
            slow++;
        }
    }
}
