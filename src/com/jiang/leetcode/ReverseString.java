package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/4/15.
 * 题目一：反转字符串
 * 方法一：
 * 将字符串转换成字符数组，然后二分之一循环，交换值
 * 字符数组和字符串的相互转换https://blog.csdn.net/Angel_guoo/article/details/79114291
 * 十种方法：http://www.importnew.com/30579.html
 *
 * 题目二：给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

 示例 1:

 输入: "Let's take LeetCode contest"
 输出: "s'teL ekat edoCteeL tsetnoc"
 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

 * 方法一：字符串拼接（String类不可变，会特别慢）590ms
 * 方法二：改成StringBuffer类 11ms
 * 666
 *
 */
public class ReverseString {

    public static String reverse(String a){
        char[] b = a.toCharArray();
        int l=b.length;
        for (int i=0;i<(b.length/2);i++){
            char temp=b[i];
            b[i]=b[l-1];
            b[l-1]=temp;
            l =l-1;

        }
        a= String.valueOf(b);
        return a;
    }
    //charAt
    public static String reverse1(String a){
        //String b=new String() ;
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        return b;
    }

    public void reverseString(char[] s) {
        int length=s.length;
        for (int i=0;i<length/2;i++){
            char temp=s[i];
            s[i]=s[length-1-i];
            s[length-1-i]=temp;
        }
    }


    public String reverseWords(String s) {
        String[] a=s.split(" ");
        String b="";
        for (int i=0;i<a.length;i++){
            String temp=reverse(a[i]);
            b+=temp;
            if (i!=a.length-1){
                b+=" ";
            }
        }
        return b;
    }

    //使用StringBuffer
    public String reverseWords1(String s) {
        String[] a=s.split(" ");
        StringBuffer b=new StringBuffer();
        for (int i=0;i<a.length;i++){
            String temp=reverse(a[i]);
            b.append(temp);
            b.append(" ");
        }
        s=b.toString().trim();
        return s;
    }



    public static void main(String[] args) {
        String a="Let's take LeetCode contest";
//        a=reverse(a);
//        System.out.println("a: "+a);
       // a=reverse1(a);
      //  char[] a={'h','e','l','l','o','w','o','r','d'};
        ReverseString r=new ReverseString();
       // r.reverseString(a);
        String s=r.reverseWords1(a);
        System.out.println(s);
    }
}
