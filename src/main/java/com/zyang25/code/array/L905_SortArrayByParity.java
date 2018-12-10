package com.zyang25.code.array;

public class L905_SortArrayByParity {
	public static void main(String[] args) {
		int[] test = new int[] {1, 4, 2, 3};
		int[] r = sortArrayByParity(test);
		for (int i : r) {
			System.out.println("The array is " + i);
		}
	}
	
	private static int[] sortArrayByParity(int[] A) {
		//[1,4,2,3]
		//[4,2,1,3]
		if(A.length == 0)
			return A;
		
		int[] r = new int[A.length];
		
		int count = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0) {
				r[count] = A[i];
				count++;
			}
		}

		for(int i = 0; i < A.length; i++) {
			if(A[i] % 2 != 0) {
				r[count] = A[i];
				count++;
			}
		}
		
		return r;
	}
}
