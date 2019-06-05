package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/2.
 *题目：
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。

 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：

 如果 S[i] == "I"，那么 A[i] < A[i+1]
 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *
 *
 */
public class DiStringMatch {
    public int[] diStringMatch(String S) {
        int length=S.length();
        int c=0;
        int [] temp=new int[length+1];
        for (int i=0;i<S.length();i++){
            if (S.charAt(i)=='I'){
               temp[i]=c++;
            }
            if (S.charAt(i)=='D'){
               temp[i]=length--;
            }
        }
        temp[S.length()]=c;
        return temp;
    }

    public static void main(String[] args) {
        DiStringMatch d=new DiStringMatch();
        String S="IDID";
        int[] temp=d.diStringMatch(S);
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
