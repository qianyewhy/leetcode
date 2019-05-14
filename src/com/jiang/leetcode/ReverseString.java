package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/4/15.
 * 方法一：
 * 将字符串转换成字符数组，然后二分之一循环，交换值
 * 字符数组和字符串的相互转换https://blog.csdn.net/Angel_guoo/article/details/79114291
 * 十种方法：http://www.importnew.com/30579.html
 * 666
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
       // System.out.println(a);
        return a;
    }
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
            if (a[i]!=" "){
                reverse(a[i]);
                b+=a[i];

            }else {
                b+=" ";
            }

        }
       // s=String.valueOf(a);

        return b;

    }



    public static void main(String[] args) {
        String a="Let's take LeetCode contest";
//        a=reverse(a);
//        System.out.println("a: "+a);
       // a=reverse1(a);
      //  char[] a={'h','e','l','l','o','w','o','r','d'};
        ReverseString r=new ReverseString();
       // r.reverseString(a);
        String s=r.reverseWords(a);
        System.out.println(s);
    }
}
