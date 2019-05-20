package com.jiang.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangxin on 2019/5/16.
 *
 * 题目：
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * 第一种方法：map记录次数，找到值大于一半的
 * 第二种方法：排序找中间的值
 * 第三种方法：
 */
public class MajorityElement {
    //利用map记录次数
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap();

        for (int i:nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return 1;
    }

    //排序，求中间的数
    public int majorityElement1(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];

    }

    //从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个
    public int majorityElement2(int[] nums){
        int temp=nums[0];
        int count=1;
        for (int i=1;i<nums.length;i++){
            if (temp==nums[i]){
                count++;
            }
            else {
                count--;
                if (count==0){
                    temp=nums[i];
                    count=1;
                }
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        MajorityElement m=new MajorityElement();
        int[] nums={1,2,2,5,5,5};

        System.out.println(m.majorityElement2(nums));
    }


}
