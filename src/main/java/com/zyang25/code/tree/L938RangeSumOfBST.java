package com.zyang25.code.tree;

import com.zyang25.model.TreeNode;

public class L938RangeSumOfBST {
    public static void main(String[] args) {
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;

        return inRange(root.val, L, R) + rangeSumBST(root.left, L, R) + rangeSumBST(root.left, L, R);
    }

    private int inRange(int val, int L, int R){
        if(val >= L && val <= R)
            return val;
        else
            return 0;
    }
}
