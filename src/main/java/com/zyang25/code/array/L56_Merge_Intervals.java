package com.zyang25.code.array;

import java.util.*;

public class L56_Merge_Intervals {
    public static void main(String[] args) {
        L56_Merge_Intervals s = new L56_Merge_Intervals();
        //s.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});

        //s.merge(new int[][]{{1,4},{4,5}});

        //s.merge(new int[][]{{1,4}});

        //s.merge(new int[][]{{1,4}, {2, 3}});

        //s.merge(new int[][]{{1,4}, {0, 2}, {3, 5}});

        s.merge(new int[][]{{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}});
    }

    public int[][] merge(int[][] intervals) {
        if(intervals.length < 2)
            return intervals;

        ArrayList<int[]> arr = new ArrayList<>();

        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        int[] prev = intervals[0];
        arr.add(prev);

        for(int i = 1; i < intervals.length; i++) {

            if (prev[1] >= intervals[i][0]) {
                int minStart = Math.min(intervals[i][0], prev[0]);
                int maxEnd = Math.max(intervals[i][1], prev[1]);

                int[] merged = new int[]{minStart, maxEnd};

                prev = merged;

                arr.remove(arr.size()-1);
            } else {
                prev = new int[]{intervals[i][0], intervals[i][1]};
            }
            arr.add(prev);
        }

        int[][] result = new int[arr.size()][2];

        int c = 0;
        while (c < arr.size()) {
            int[] a = arr.get(c);
            result[c][0] = a[0];
            result[c][1] = a[1];
            c++;
        }

        return result;
    }
}
