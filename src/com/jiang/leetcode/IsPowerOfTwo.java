package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/26.
 * 题目：
 *  给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n==1){
            return true;
        }

        while (n!=0){
            if (n%2!=0){
                return false;
            }
            if (n/2==1&&n%2==0){
                return true;
            }
            n=n/2;
        }
        return false;
    }

    public static void main(String[] args) {
        IsPowerOfTwo i=new IsPowerOfTwo();
        int n=10;
        System.out.println(i.isPowerOfTwo(n));
    }
}
