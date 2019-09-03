package com.zyang25.code.array;

public class L88MergeSortedArray {
    public static void main(String[] args) {

    }

//    nums1 = [1,2,3,0,0,0], m = 3
//    nums2 = [2,5,6],       n = 3
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];

        int i = 0;
        int j = 0;

        while (i < m || j < n) {
            if(i < m && j < n) {
                temp[i+j] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
            } else if(i < m) {
                temp[i+j] = nums1[i++];
            } else if(j < n) {
                temp[i+j] = nums2[j++];
            }
        }

        for (int k = 0; k < temp.length; k++) {
            nums1[k] = temp[k];
        }
    }
}
