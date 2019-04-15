package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/4/10.
 */
public class BinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode();

    }
    public void preOrder(BinaryTreeNode root){
        while (root!= null){
            System.out.println(root.value);
            preOrder(root.leftNode);
            preOrder(root.rightNode);
        }
    }
    public void inOrder(BinaryTreeNode root){
        while (root!=null){
            inOrder(root.leftNode);
            System.out.println(root.value);
            inOrder(root.rightNode);
        }
    }
    public void postOrder(BinaryTreeNode root){
        while (root!=null){
            postOrder(root.leftNode);
            postOrder(root.rightNode);
            System.out.println(root.value);
        }
    }
}
