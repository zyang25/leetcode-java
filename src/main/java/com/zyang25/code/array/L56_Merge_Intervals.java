package com.zyang25.code.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class L56_Merge_Intervals {
    public static void main() {
        L56_Merge_Intervals s = new L56_Merge_Intervals();
//        s.merge()
    }

    public int[][] merge(int[][] intervals) {
        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= intervals[i-1][0] && intervals[i][0] <= intervals[i-1][1]) {
            }
        }

        return intervals;
    }
}
