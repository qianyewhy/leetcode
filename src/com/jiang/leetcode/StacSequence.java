package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/4/19.
 * 实现简单栈
 * 栈的方法：
 * pop弹出栈顶元素
 * push压入数据
 * peek返回栈顶元素
 * empty栈置空
 * 思路：
 * 1、顺序栈
 * 2、链式栈
 *
 */
public class StacSequence {
    private int maxsize;//栈的长度
    private int top;
    private char[] attr;

    //栈的初始化
    public StacSequence(int size){
        maxsize=size;
        top=-1;
        attr=new char[maxsize];
    }
    //压入数据
    public void push(char temp){
        attr[++top]=temp;
    }
    //弹出栈顶元素
    public char pop(){
        char temp=attr[top];
        maxsize--;
        top--;
        System.out.println(temp);
        return temp;
    }
    //返回栈顶元素
    public char peek(){
        System.out.println(attr[top]);
        return attr[top];
    }
    //判断栈是否为空,这么写代码更简洁
    public boolean isempty(){
        return maxsize==0;
    }
    //返回栈的长度
    public int size(){
        return maxsize;
    }
    //栈置空
    public void empty(){
        maxsize=0;
    }
    public static void main(String[] args) {
        int maxsize=5;
        StacSequence s = new StacSequence(maxsize);
        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        s.push('e');
        boolean a=s.isempty();
        System.out.println(a);
        s.peek();
        s.pop();
        s.peek();
        int length=s.size();
        System.out.println(length);
        s.empty();
        a=s.isempty();
        System.out.println(a);

    }
}
