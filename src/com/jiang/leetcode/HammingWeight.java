package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/30.
 * 题目：
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 知识点：>>无符号位移，>>>无符号位移，高位全部补0，
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            count+=n&1;
            n= n>>>1;
        }
       return count;
    }
    public int hammingWeight1(int n){
        String temp=Integer.toBinaryString(n);
        int count=0;
        for (int i=0;i<temp.length();i++){
            if (temp.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        HammingWeight h= new HammingWeight();
        int n=-3;
        int count=h.hammingWeight1(n);
        System.out.println(count);
    }
}
