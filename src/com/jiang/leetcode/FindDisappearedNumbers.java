package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/29.
 * 题目：
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 示例:

 输入:
 [4,3,2,7,8,2,3,1]
 输出:
 [5,6]
 *
 *
 *
 */
//public class FindDisappearedNumbers {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> list=new ArrayList<Integer>();
//        Arrays.sort(nums);
//        for (int i=0;i<nums.length;i++){
//            if (1){
//                list.add(nums[i]+1);
//            }
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//        FindDisappearedNumbers f=new FindDisappearedNumbers();
//        int[] nums={4,3,2,7,8,2,3,1};
//        List list=f.findDisappearedNumbers(nums);
//        System.out.println(list.toString());
//    }
//}
