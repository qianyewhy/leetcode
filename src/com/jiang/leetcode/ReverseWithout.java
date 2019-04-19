package com.jiang.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by jiangxin on 2019/4/18.
 * 头条面试算法题：有一个www.tou\b\tiao.com的域名 将他们按.和\分割倒序组合到一起 变成 com.tiao\b\tou.www
 * 思路：
 * 1、按.和\分割字符串，即分三部分正常字符串.\，存到字符串数据中
 * 2、然后逆序
 */
public class ReverseWithout {
    public static String reverse(String s){
        String[] attr = new String[30];
        Arrays.fill(attr,"");
        int t =0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!='.'&&s.charAt(i)!='\\'){
                attr[t]+=String.valueOf(s.charAt(i));
            }
            if (s.charAt(i)=='.'){
                t++;
                attr[t]=".";
                t++;
            }
            if (s.charAt(i)=='\\'){
                t++;
                attr[t]="\\";
                t++;
            }
        }
        String b ="";
        for (int i=attr.length-1;i>=0;i--){
            if (attr[i]!=""){
                b+=attr[i];
            }
        }
        return b;
    }

    public static String reverse1(String s){
        Stack stack = new Stack();
        int startindex=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='.'||s.charAt(i)=='\\'){
                stack.push(s.substring(startindex,i));
                stack.push(s.charAt(i));
                startindex=i+1;
            }
            if (i==s.length()-1&&s.charAt(i)!='.'&&s.charAt(i)!='\\'){
                stack.push(s.substring(startindex,s.length()));
            }

        }
        String b="";
        while (!stack.empty()){
            b+=stack.pop();
        }
        return b;
    }

    public static void main(String[] args) {
        String s="www.tou\\b\\tiao.com";
       // String b = reverse(s);
        String b = reverse1(s);
        System.out.println(b);
    }

}
