package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/12.
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。

 如果有两个中间结点，则返回第二个中间结点。
 * 第一种基本思路：先求链表的长度，然后找到中间值
 * 第二种思路：使用快慢指针，时间复杂度比上面少一半；
 */
public class MiddleNode {
    //使用快慢指针
    public ListNode middleNode1(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }


    //先求长度
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while (head!=null){
            head=head.next;
            count++;
        }
        int t=count/2+1;
        for (int i=1;i<t;i++){
            temp=temp.next;
        }
        return temp;
    }


    public static void main(String[] args) {
        MiddleNode m=new MiddleNode();
        ListNode head=new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(3);
        head.next=node1;
        node1.next=node2;

        ListNode a=m.middleNode1(head);
        while (a!=null){
            System.out.println(a.val);
            a=a.next;
        }
    }
}
