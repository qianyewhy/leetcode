package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/12.
 * 题目：203. 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 */
public class RemoveElementList{
    //生成新链表
    public ListNode removeElements(ListNode head, int val) {
        ListNode newlist=null;
        ListNode tailer=null;
        ListNode temp=null;
        if (head==null){
            return null;
        }
        while (head!=null){
            if (head.val!=val){
                temp=new ListNode(head.val);
                if (newlist==null){
                    newlist=tailer=temp;
                }else {
                    tailer.next=temp;
                    tailer=temp;
                }
            }
            head=head.next;
        }
        return newlist;
    }

    //原链表操作

    public static void main(String[] args) {
        RemoveElementList r=new RemoveElementList();
        ListNode head=new ListNode(1);
        ListNode t1=new ListNode(2);
        ListNode t2=new ListNode(6);
        ListNode t3=new ListNode(3);
        ListNode t4=new ListNode(4);
        ListNode t5=new ListNode(5);
        ListNode t6=new ListNode(6);
        head.next=t1;
        t1.next=t2;
        t2.next=t3;
        t3.next=t4;
        t4.next=t5;
        t5.next=t6;
        ListNode temp=r.removeElements(head,6);
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

    }
}
