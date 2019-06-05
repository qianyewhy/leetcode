package com.jiang.leetcode;

import java.util.HashMap;

/**
 * Created by jiangxin on 2019/6/3.
 * 题目：1. 两数之和
 *
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] temp=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                temp[0]=map.get(target-nums[i]);
                temp[1]=i;
            }else {
                map.put(nums[i],i);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        TwoSum t=new TwoSum();
        int[] nums={2, 7, 11, 15};
        int target=26;
        int[] temp=t.twoSum(nums,target);
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
