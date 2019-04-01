package com.jiang.leetcode;

import java.util.Arrays;

/**
 * Created by jiangxin on 2019/3/28.
 * 题目：
 * 题目描述:输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
 * 假设前序遍历和中序遍历结果中都不包含重复的数字，
 * 例如输入的前序遍历序列 {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}重建出如图所示的二叉树。
 *
 * 思路：递归的思想
 * 1、前序的第1个元素一定是根节点
 * 2、截取中序根节点左边的元素作为左子树的中序
 * 3、截取前序从第2个元素开始，左子树的前序
 * 4、同样截取右子树的前序和中序
 * 5、递归----结束的标志是输出叶子节点
 *
 * 对递归掌握的不好。。。。。手写能构建。。。。代码不知道怎么写
 *
 * Arrays.copyOfRange(T[ ] original,int from,int to)
 * 将一个原始的数组original，从小标from开始复制，复制到小标to，生成一个新的数组。注意这里包括下标from，不包括上标to。
 *
 */
public class RcBinaryTreeNode {
    public static void main(String[] args){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in  = {4,7,2,1,5,3,8,6};
        BinaryTreeNode root = construct(pre,in);
    }

    public static BinaryTreeNode construct(int[] preorder,int[] inorder){
        if (preorder == null||inorder == null){
            return  null;
        }
        if (preorder.length!=inorder.length){
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode();
        for (int i =0;i< inorder.length;i++){
            if (inorder[i]==preorder[0]){
                //前序输出
                root.value=inorder[i];
                System.out.println(root.value);
                root.leftNode=construct(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                root.rightNode=construct(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
            }
        }
        return root;
    }
}


class BinaryTreeNode {
    public static int value;
    public BinaryTreeNode leftNode;
    public BinaryTreeNode rightNode;
}
