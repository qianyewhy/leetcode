package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/3/25.
 * 题目:请实现一个函数，把字符串中的每个空格替换成“%20”
 * 第一种方法：
 * 字符串方法String.replaceAll()
 * 第二种方法：
 * 利用StringBuffer存储
 *
 */
public class ReplaceBlank {
    public static void replace(String a){
        String b=a.replaceAll(" ","%20");
       System.out.println(b);
    }


    public static void replace1(String b){
        StringBuffer outputbuffer=new StringBuffer();
        for (int i=0;i<b.length();i++){
            if (b.charAt(i)==' '){
                outputbuffer.append("%");
                outputbuffer.append("2");
                outputbuffer.append("0");
            }else {
                outputbuffer.append(b.charAt(i));
            }
        }
       System.out.println(outputbuffer);
    }

    public static void main(String[] args){
        String a = "he ll o";
        replace(a);
        replace1(a);

    }
}
