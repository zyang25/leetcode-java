package com.zyang25.code.array;

public class L167TwoSumII {

//  Input: numbers = [2,7,11,15], target = 9
//  Output: [1,2]
//  Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length;

        while(i < j) {
            int r = numbers[i] + numbers[j];

            if(r > target)
                j--;
            else if(r < target)
                i++;
            else
                break;
        }
        return new int[] {i, j};
    }
}
