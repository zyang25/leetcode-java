package com.zyang25.code.array;

import java.util.stream.IntStream;

public class L643_Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int[] a = new int[]{1,12,-5,-6,50,3};

        System.out.print(findMaxAverage(a, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int tmp = IntStream.of(nums).limit(4).sum();

        if(nums.length <=4)
            return tmp;

        int i = 0;
        int j = 3;

        while (i <= nums.length - 4 && j < nums.length) {
            
        }
        return 0;
    }
}
