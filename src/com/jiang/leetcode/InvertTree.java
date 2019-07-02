package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/30.
 * 226. 翻转二叉树
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        if (root.right==null&&root.left==null){
            return root;
        }
        TreeNode temp=null;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        root.left=invertTree(root.left);
        root.right=invertTree(root.right);
        return root;

    }
}
