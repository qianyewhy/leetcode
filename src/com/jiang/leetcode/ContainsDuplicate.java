package com.jiang.leetcode;

import java.util.*;

/**
 * Created by jiangxin on 2019/5/16.
 *
 * 题目：
 * 给定一个整数数组，判断是否存在重复元素。

 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。


 */
public class ContainsDuplicate {
    //利用map，如果map存在这个key，代表重复
    public boolean containsDuplicate(int[] nums) {
        HashMap map=new HashMap();
        if (nums.length==0){
            return false;
        }
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return true;
            }else {
                map.put(nums[i],1);
            }
        }
        return false;

    }
    //利用Set去重的特性，看长度是否一致
    public boolean containsDuplicate1(int[] nums) {
        Set s=new HashSet();
        for (int i:nums){
            s.add(i);
        }
        return s.size()!=nums.length;

    }

    //排序，看临近值是否一致，一致则重复
    public boolean containsDuplicate2(int[] nums) {
        if (nums.length==0){
            return false;
        }
        Arrays.sort(nums);
       for (int i=1;i<nums.length;i++){
           if (nums[i]==nums[i-1]){
               return true;
           }
       }
        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate c=new ContainsDuplicate();
        int[] nums={1,3};
        System.out.println(c.containsDuplicate2(nums));
    }
}
