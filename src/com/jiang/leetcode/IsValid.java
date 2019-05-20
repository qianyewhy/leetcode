package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/20.
 * 题目：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

   有效字符串需满足：
   左括号必须用相同类型的右括号闭合。
   左括号必须以正确的顺序闭合。
   注意空字符串可被认为是有效字符串。
 *
 */
public class IsValid {
    public boolean isValid(String s) {
        if (s.length()==0){
            return true;
        }
        int a=0,b=0,c=0,d=0,e=0,f=0;
        for (int i=0;i<s.length();i++){
            if ('('==s.charAt(i)){
                a++;
            }
            if (')'==s.charAt(i)){
                b++;
            }
            if ('['==s.charAt(i)){
                c++;
            }
            if (']'==s.charAt(i)){
                d++;
            }
            if ('{'==s.charAt(i)){
                e++;
            }
            if ('}'==s.charAt(i)){
                f++;
            }
        }
        return a==b&&c==d&&e==f;
    }

    public static void main(String[] args) {
        IsValid i=new IsValid();
        String s="()[]{}";
        System.out.println(i.isValid(s));
    }
}
