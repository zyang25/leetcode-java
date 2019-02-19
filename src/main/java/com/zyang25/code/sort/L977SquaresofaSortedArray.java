package com.zyang25.code.sort;

import java.util.Arrays;

class L977SquaresofaSortedArray {
    public static void main(String[] args) {
        L977SquaresofaSortedArray app = new L977SquaresofaSortedArray();
        for (int e : app.sortedSquares(new int[]{-4, -1, 0, 3, 10})) {
            System.out.println(e);
        }
    }

    //[-4,-1,0,3,10]
    public int[] sortedSquares(int[] A) {
        int i = 0;
        for (int e : A) {
            A[i] = e * e;
            i++;
        }

        Arrays.sort(A);
        return A;
    }
}
