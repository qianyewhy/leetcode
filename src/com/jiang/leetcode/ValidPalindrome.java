package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/7/1.
 */
public class ValidPalindrome {
    //顺序删除字符---处理长字符，存在超时的情况
    public boolean validPalindrome(String s) {
        if (palindrome(s)){
            return true;
        }

       // StringBuffer temp1=temp;
        for (int i=0;i<s.length();i++){
            StringBuffer temp=new StringBuffer(s);
            if (palindrome(temp.deleteCharAt(i).toString())){
                return true;
            }
        }
        return false;
    }

    //左右对比
    public boolean palindrome1(String s) {
        int l=s.length()-1;
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(l)){
                return false;
            }
            l--;
        }
        return true;
    }
    //利用StringBuffer的reverse方法，判断是否是回文字符串
    public boolean palindrome(String s) {
        StringBuffer temp=new StringBuffer(s);
        if (s.equals(temp.reverse().toString())){
            return true;
        }
        return false;
    }



    //利用左右指针
    public boolean validPalindrome1(String s){
        int start=0;
        int end=s.length()-1;
        if (palindrome1(s,start,end)){
            return true;
        }
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return palindrome1(s,start+1,end)||palindrome1(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean palindrome1(String s,int start,int end){
        for (int i=start;i<end;i++){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome v=new ValidPalindrome();
        String s="a";
        System.out.println(v.validPalindrome1(s));
    }
}
