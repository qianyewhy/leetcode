package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/6.
 * 题目：实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * 思路：将字符串转换成字符数组，然后循环，大写字母+32变成小写字母
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        String temp="";
        char[] s=str.toCharArray();
        if (str!=null){
            for (int i=0;i<s.length;i++){
                if (s[i]>='A'&&s[i]<='Z'){
                    s[i]+=32;
                    temp+=s[i];
                }else{
                    temp+=s[i];
                }
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        ToLowerCase t=new ToLowerCase();
        String str="HELLO";
        String temp=t.toLowerCase(str);
        System.out.println(temp);
    }
}
