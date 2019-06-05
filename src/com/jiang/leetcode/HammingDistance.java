package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/28.
 * 题目：
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 思路：
 * 第一种：利用Java异或运算，相同的为0，不同的为1，x和y异或运算，然后值转化为字符串统计1的个数
 * 第二种：利用Java的移位运算，>>表示最右边删掉一位
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        String temp=Integer.toBinaryString(x^y);
        int count=0;
        for (int i=0;i<temp.length();i++){
            if (temp.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    public int hammingDistance1(int x, int y){
        int sum=0;
        while (x!=0||y!=0){
          //  sum+=((x&1)!=(y&1))?1:0;
            if ((x&1)!=(y&1)){
                sum+=1;
            }
            x>>=1;
            y>>=1;
        }
        return sum;
    }

    public static void main(String[] args) {
        HammingDistance h=new HammingDistance();
        int x=0,y=4;
//        System.out.println(0&1);
//        System.out.println(4&1);
        System.out.println(h.hammingDistance1(x,y));
    }
}
