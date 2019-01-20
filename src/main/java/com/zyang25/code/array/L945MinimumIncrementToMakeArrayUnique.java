package com.zyang25.code.array;

import java.util.Arrays;

// solution https://blog.csdn.net/qq_17550379/article/details/84985831
public class L945MinimumIncrementToMakeArrayUnique {
	public static void main(String[] args) {
	}
	
	//1, 1, 2, 2, 3, 7
    public int minIncrementForUnique(int[] A) {
    	Arrays.sort(A);
    	
    	int step = 0;
    	int res  = 0;
    	
    	for(int i = 0; i < A.length; i++) {
    		// compare step and curr, take the bigger one as the next step target
    		// calculate how many steps you need to achieve the target
    		res += Math.max(step, A[i]) - A[i];
    		
    		// take the bigger number as a target and + 1 as a next target
    		step = Math.max(step, A[i]) + 1;
    	}
    	
    	return res;
    }
}
