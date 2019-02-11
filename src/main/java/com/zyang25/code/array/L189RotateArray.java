package com.zyang25.code.array;

public class L189RotateArray {

	public static void main(String[] args) {
        L189RotateArray app = new L189RotateArray();
        app.rotate(new int[]{1,2,3,4,5,6}, 2);
	}
	
	public void rotate(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int i = 0;
        int val = nums[i];
        while(n > count){
            int pos = i + k;

            if(pos >= n)
                pos = pos % n;

            int temp = val;
            val = nums[pos];
            nums[pos] = temp;

            i = pos;
            count++;
        }
    }

}

// [1,2,3,4,5,6]
// [5,6,1,2,3,4]
// 9 % 7 

//8/6