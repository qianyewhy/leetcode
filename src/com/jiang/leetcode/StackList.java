package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/4/19.
 *
 */
public class StackList {
    private  ListNode top;
    //private int maxsize;
   // private ListNode top;

    public StackList(){
        top=null;
    }
    //压入数据
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next=top;
        top=temp;
    }
    //弹出数据
    public int pop() {
        //int temp = 0;
        if(isempty()){
            System.out.println("栈空啦");
            return -1;
        }
        System.out.println(top.data);
        int temp = top.data;
        top = top.next;
        return temp;
    }
    //返回栈顶元素
    public int peek(){
        if (isempty()){
           return -1;
        }
        System.out.println(top.data);
        return top.data;
    }
    //判断栈是否为空
    public boolean isempty(){
        return top==null;
    }


    public static void main(String[] args) {
        StackList s = new StackList();
        s.push(1);
        s.push(2);
        boolean temp=s.isempty();
        System.out.println(temp);
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        temp= s.isempty();
        System.out.println(temp);
        s.pop();
    }
}







