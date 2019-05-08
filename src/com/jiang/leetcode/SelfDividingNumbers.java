package com.jiang.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxin on 2019/5/8.
 * 题目：自除数 是指可以被它包含的每一位数除尽的数。

 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。

 还有，自除数不允许包含 0 。

 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 *第一种方法：
 * 将int转换成string然后按位整除，如果能整除，计数器加1，计数器等于int的长度代表是自除数
 * 第二种方法：
 * 通过模10的方法取各个数
 * 模10取余数，➗除10取商
 *
 *
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> temp=new ArrayList<Integer>();
        for (int i=left;i<=right;i++){
            String t=String.valueOf(i);
            int count=0;
            for (int j=0;j<t.length();j++){
                int a=t.charAt(j)-'0';
                if (a==0){
                    continue;
                }
                if (i%a==0){
                    count++;
                }
            }
            if (count==t.length()){
                temp.add(i);
            }
        }
        return temp;
    }


    public List<Integer> selfDividingNumbers1(int left,int right){
        List<Integer> temp=new ArrayList<Integer>();
        for (int i=left;i<=right;i++){
            int num=i;
            while (num!=0){
                int re=num%10;
                if (re==0||i%re!=0){
                    break;
                }
                num=num/10;
            }
            if (num==0){
                temp.add(i);
            }
        }
        return temp;

    }
    public static void main(String[] args) {
        SelfDividingNumbers s = new SelfDividingNumbers();
        int left=21,right=22;
        List<Integer> temp=s.selfDividingNumbers1(left,right);
        for (Integer t:temp){
            System.out.println(t);

        }
    }
}
