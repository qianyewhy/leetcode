package com.jiang.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangxin on 2019/6/27.
 */
public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                int temp=map.get(nums[i])+1;
                map.put(nums[i],temp);
            }else {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry entry :map.entrySet()){
            if (Integer.parseInt(entry.getValue().toString())>1){
                return Integer.parseInt(entry.getKey().toString());
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        FindDuplicate f=new FindDuplicate();
        int[] nums={3,1,2,5,3};
        System.out.println(f.findDuplicate(nums));
    }
}
