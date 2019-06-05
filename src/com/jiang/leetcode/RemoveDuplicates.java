package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/26.
 *
 * 题目：
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 思路：
 * 使用temp记录重复数字个数，相邻元素相等temp++，不想等，就交换值
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return -1;
        }
        int temp=0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                temp++;
            }
            else {
                nums[i+1-temp]=nums[i+1];
            }
        }
        return nums.length-temp;
    }

    public static void main(String[] args) {
        RemoveDuplicates r=new RemoveDuplicates();
        int[] nums={0};
        int length=r.removeDuplicates(nums);
        for (int i=0;i<length;i++){
            System.out.println(nums[i]);
        }
    }
}
