package com.jiang.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by jiangxin on 2019/6/2.
 * 题目：961. 重复 N 次的元素
 */
public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int t=A.length/2;
        if (A[0]==A[1]){
            return A[t-1];
        }else {
            return A[t];
        }
    }

    public int repeatedNTimes1(int[] A){
        HashMap h=new HashMap();
        for (int i=0;i<A.length;i++){
            if (h.containsKey(A[i])){
                return A[i];
            }else {
                h.put(A[i],1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RepeatedNTimes r=new RepeatedNTimes();
        int[] A={1,3,3,4};
        int temp=r.repeatedNTimes1(A);
        System.out.println(temp);
    }
}
