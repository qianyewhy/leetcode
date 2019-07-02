package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/10.
 * 题目：27. 移除元素
 *
 */
public class RemoveElementArray {
    public int removeElement(int[] nums, int val) {
        int right=nums.length-1;
        int left=0;
        if (nums.length==1&&nums[0]==val){
            return 0;
        }
        if (nums.length==1&&nums[0]!=val){
            return 1;
        }
        while (left<right){
            if (left>=right){
                return left;
            }
            while (left<right&&nums[left]!=val){
                left++;
            }
            while (left<right&&nums[right]==val){
                right--;
            }
            if (left<right){
                nums[left]=nums[right];
                left++;
                right--;
            }else if (left>=right&&nums[left]!=val){
                return left+1;
            }else if (left>=right&&nums[left]==val){
                return left;
            }
        }
        if (left==right&&nums[left]!=val){
            return left+1;
        }else if (left>right){
            return left;
        }else if (left==right&&nums[left]==val){
            return left;
        }
        return left;
    }


    public int removeElement1(int[] nums, int val) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int len=nums[0]==val?1:0;
        for (int i=1;i<nums.length;i++){
            nums[i-len]=nums[i];
            if (nums[i]==val){
                len++;
            }
        }
        return nums.length-len;
    }

    public static void main(String[] args) {
        RemoveElementArray r=new RemoveElementArray();
        int[] nums={4,4,5};
        int val=4;
        int count=r.removeElement1(nums,val);
        System.out.println(count);
    }
}
