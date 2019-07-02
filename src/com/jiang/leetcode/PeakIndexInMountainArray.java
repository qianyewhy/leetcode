package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/25.
 * 852. 山脉数组的峰顶索引
 */
public class PeakIndexInMountainArray {
    //打桩法，也叫单向扫描
    public int peakIndexInMountainArray(int[] A) {
        if (A.length<3){
            return 0;
        }
        int temp=A[0];
        int index=0;
        for (int i=1;i<A.length;i++){
            if (A[i]>temp){
                temp=A[i];
                index=i;
            }
        }
        return index;
    }

    //二分法,分治法，二分查找，是适用于此题的最佳解法，时间复杂度为O(logn)，优点是效率高，缺点是不具有普适性
    public int peakIndexInMountainArray1(int[] A){
        int left=0;
        int right=A.length;
        while (left<right){
            int enter=(left+right)/2;
            if (A[enter]>A[enter-1]&&A[enter]>A[enter+1]){
                return enter;
            }else if (A[enter]<A[enter-1]){
                right=enter;
            }else {
                left=enter;
            }
        }
        return 1;
    }


    //双指针,也叫双向扫描，左右两边同时向中间扫描，以找出最大值，这个算法其实是在打桩法之上的一个效率优化，
    // 时间复杂度为O(n/2)--->O(n)，效率较低，但比打桩法效率高，同时也具有普适性
    public int peakIndexInMountainArray2(int[] A){
        int max=0;
        int index=0;
        int left=0;
        int right=A.length-1;
        while (left<right){
            if (A[left]>max){
                max=A[left];
                index=left;
            }
            if (A[right]>max){
                max=A[right];
                index=right;
            }
            right--;
            left++;
        }
        return index;
    }

    //暴力求解
    public int peakIndexInMountainArray3(int[] A){
        for (int i=1;i<A.length-1;i++){
            if (A[i]>A[i-1]&&A[i]>A[i+1]){
                return i;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        PeakIndexInMountainArray p=new PeakIndexInMountainArray();
        int[] A={0,2,1,0};
        System.out.println(p.peakIndexInMountainArray2(A));
    }
}
