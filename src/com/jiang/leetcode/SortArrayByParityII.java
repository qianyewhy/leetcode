package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/30.
 * 922. 按奇偶排序数组 II
 */
public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] arr) {
        if(arr.length<2){//边界
            return arr;
        }

        int odd=1;    //奇指针
        int even=0;  //偶指针

        while(odd<arr.length&&even<arr.length){
            //找到奇指针对应的数不为奇数的地方
            while (odd<arr.length&&arr[odd]%2!=0){
                odd+=2;
            }
            //找到偶指针对应的数不为偶数的地方
            while(even<arr.length&&arr[even]%2==0){
                even+=2;
            }
            if(odd<arr.length&&even<arr.length){
                int temp=arr[odd];
                arr[odd]=arr[even];
                arr[even]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SortArrayByParityII s=new SortArrayByParityII();
        int[] A={3,0,4,0,2,1,3,1,3,4};
        A=s.sortArrayByParityII(A);
        for (int i:A){
            System.out.println(i);
        }
    }
}
