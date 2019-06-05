package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/26.
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String s1=String.valueOf(x);
        StringBuffer s2=new StringBuffer(s1);
        return s1.equals(s2.reverse().toString());
    }

    public static void main(String[] args) {
        IsPalindrome i=new IsPalindrome();
        int x=101;
        System.out.println(i.isPalindrome(x));
    }
}
