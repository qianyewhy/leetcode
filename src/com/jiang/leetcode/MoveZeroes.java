package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/29.
 *题目：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 示例:

 输入: [0,1,0,3,12]
 输出: [1,3,12,0,0]
 *
 *
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count=0,temp=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                count++;
            }else {
                nums[temp++]=nums[i];
            }
        }
        for (int i=nums.length-count;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes m=new MoveZeroes();
        int[] nums={0,1,0,3,12};
        m.moveZeroes(nums);
        for (int i:nums){
            System.out.println(i);
        }
    }
}
