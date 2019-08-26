package com.zyang25.code.array;

import java.util.ArrayList;

public class L986IntervalListIntersections {
    public static void main(String[] args) {
        L986IntervalListIntersections s = new L986IntervalListIntersections();
        s.intervalIntersection(
                new int[][]{
                    {0,2},{5,10},{13,23},{24,25}
                },
                new int[][]{
                    {1,5},{8,12},{15,24},{25,26}
                });
    }

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0;
        int j = 0;
        ArrayList<int[]> arr = new ArrayList<>();

        while (i < A.length && j < B.length) {
            if(isOverlap(A[i], B[j])) {
                int mStart = Math.max(A[i][0], B[j][0]);
                int mEnd = Math.min(A[i][1], B[j][1]);

                arr.add(new int[]{mStart, mEnd});
            }

            if(j+1 < B.length) {
                if(isOverlap(A[i], B[j+1])) {
                    j++;
                }
                else {
                    i++;
                }
            } else
                i++;
        }

        return (int[][]) arr.toArray();
    }

    private boolean isOverlap(int[] a, int[] b) {
        if(a[0] <= b[0] && b[0] <= a[1])
            return true;

        if(a[0] >= b[0] && b[1] >= a[0])
            return true;

        return false;
    }

}
