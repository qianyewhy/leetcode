package com.jiang.leetcode;

import java.util.Stack;

/**
 * Created by jiangxin on 2019/5/20.
 * 题目：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

   有效字符串需满足：
   左括号必须用相同类型的右括号闭合。
   左括号必须以正确的顺序闭合。
   注意空字符串可被认为是有效字符串。
 * 思路：
 * 核心思想： 利用栈的性质，先进后出，遇到左括号则压入栈，遇到右括号则与栈顶元素匹配，若匹配成功则将栈顶元素弹出，反之返回false。
 */
public class IsValid {
    public boolean isValid(String s) {
        if (s.length()==0){
            return true;
        }
        Stack<Character> stack=new Stack<Character>();
        char[] string=s.toCharArray();
        for (int i=0;i<string.length;i++){
            if(stack.size()==0){
                stack.push(string[i]);
            }else {
                if (stack.peek()=='['&&string[i]==']'||stack.peek()=='('&&string[i]==')'||stack.peek()=='{'&&string[i]=='}'){
                    stack.pop();
                }else {
                    stack.push(string[i]);
                }
            }
        }
        return stack.size()==0;
    }

    public static void main(String[] args) {
        IsValid i=new IsValid();
        String s="()";
        System.out.println(i.isValid(s));
    }
}
