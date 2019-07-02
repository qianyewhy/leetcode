package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/30.
 * 509. 斐波那契数
 */
public class Fib {
    //动态规划--- 动态规划遵循一套固定的流程：递归的暴力解法 -> 带备忘录的递归解法 -> 非递归的动态规划解法

    //递归实现
    public int fib(int N) {
        if (N==0||N==1){
            return N;
        }
        return fib(N-1)+fib(N-2);
    }

    //带备忘录的递归解法
//    public int fib1(int N) {
//        int[] temp = new int[N+1];
//        if (N==0||N==1){
//            return N;
//        }
//        return ;
//    }

    //备忘录
    public int  help(int[] temp,int N){
        if (N==0||N==1){
            return N;
        }
        if (temp[N]!=0){
            return temp[N];
        }
        //没有被计算过
        temp[N]=help(temp,N-1)+help(temp,N-2);
        return temp[N];

    }
    //迭代解法
    public int fib4(int N) {
        if (N==0||N==1){
            return N;
        }
        int[] temp=new int[N+1];
        temp[0]=0;
        temp[1]=1;
        for (int i=2;i<=N;i++){

            temp[i]=temp[i-1]+temp[i-2];
        }
        return temp[N];
    }

    public static void main(String[] args) {
        Fib f=new Fib();
        int N=5;
        System.out.println(f.fib(N));
    }
}
