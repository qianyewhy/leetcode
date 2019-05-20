package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/20.
 * 题目：
 *给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 第一种思路：暴力求解，从一个数开始，找最大的和，再计算第二个数开始的最大的和，以此类推，求和里面的最大值
 * 第二种思路：暴力求解优化，不需要第三重循环，算值
 * 第三种思路：动态规划
 * 1. for循环里的变量i是序列的起点，它有时会跳过若干数。当前计算的序列的和sum一旦为负时，则sum归零。循环变量i加1，从a[i+1]开始加和，即起点跳到了负数和子序列的下一个数字。
   2. 一个子序列必然是以正数开头的，因为如果以负数开头，那么去掉这个子序列便得到一个更优解。
   3. 一个子序列，如果他的前若干个数字组成的新的个数更少的子序列的和为负数，那么去掉这个子序列便得到一个更优解。
   4. 若遇到更大的和则更新max，否则不更新（没有动作）。利用第三个事实，当某个时刻子序列和为负数，归零即相当于去掉子序列所有数字，从下一个数字重新开始。
   https://blog.csdn.net/binbinxyz/article/details/79830739
 *
 */
public class MaxSubArray {
    //暴力求解，时间复杂度O(n^3)
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        //记录开始的坐标
        for (int i=0;i<nums.length;i++){
            //记录结束的坐标
            for (int j=i;j<nums.length;j++){
                int sum=0;
                //记录开始坐标到结束坐标的和
                for (int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                //记录和的最大值
                if (sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }

    //暴力求解优化
    public int maxSubArray1(int[] nums){
        int max=Integer.MIN_VALUE;
       // int start,end;
        for (int i=0;i<nums.length;i++){
            int sum=0;
            for (int j=i;j<nums.length;j++){
                sum+=nums[j];
                if (sum>max){
                    max=sum;
                }

            }
        }
        return max;
    }

    //动态规划
    public int maxSubArray2(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;

        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }

    //动态规划,返回最大和及上标和下标
    public void maxSubArray3(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=0,end=0,temp=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (sum>max){
                max=sum;
                start=temp;
                end=i;
            }
            if (sum<0){
                sum=0;
                temp=i+1;
            }
        }
        System.out.println("max:"+max);
        System.out.println("start:"+start);
        System.out.println("end:"+end);
    }

    public static void main(String[] args) {
        MaxSubArray m=new MaxSubArray();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
       // System.out.println(m.maxSubArray3(nums));
        m.maxSubArray3(nums);
    }
}
