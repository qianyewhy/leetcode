package com.jiang.leetcode;

import java.util.Arrays;

/**
 * Created by jiangxin on 2019/5/9.
 * 题目：https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 第一种思路：先求平方然后再通过快排排序
 * 第二种思路：
 * 最大值只可能出现在两端，所以可以借助一个临时数组，存储最大值；
 * 第三种思路：先求平方，然后通过 Arrays.sort(A)排序
 */
public class SortedSquares {

    //第一种方法
    public int[] sortedSquares(int[] A) {
        for (int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
       // sort(0,A.length-1,A);
        Arrays.sort(A);
        return A;

    }

    public int partition(int left,int right,int[] A){
        int key=A[left];
        while (left<right){
            while (left<right&&A[right]>=key){
                right--;
            }
            A[left]=A[right];
            while (left<right&&A[left]<=key){
                left++;
            }
            A[right]=A[left];
            A[left]=key;
        }
        return left;
    }
    public int[] sort(int left,int right,int[] A){
        //递归一定要写结束的条件
        if (left>=right){
            return null;
        }
        int mid=partition(left,right,A);
        sort(left,mid-1,A);
        sort(mid+1,right,A);
        return A;
    }


    //第二种方法
    public int[] sortedSquares1(int[] A){
        int high=A.length-1;
        int low=0;
        int t=A.length-1;
        int[] temp=new int[A.length];
        while(low<=high){
            if (A[high]*A[high]>=A[low]*A[low]){
                temp[t]=A[high]*A[high];
                high--;
                t--;
            }else {
                temp[t]=A[low]*A[low];
                low++;
                t--;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        SortedSquares s=new SortedSquares();
        int[] A={-4,-1,0,3,10};
        int[] temp=s.sortedSquares1(A);
        for (int i:temp){
            System.out.println(i);
        }
    }
}
