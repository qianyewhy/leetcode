package com.jiang.leetcode;

import java.util.Stack;

/**
 * Created by jiangxin on 2019/3/28.
 *
 * 题目:输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 * 递归实现
 * 思路：打印节点的值，递归结束的条件----
 *
 * 非递归实现
 * 思路：单链表是由指针单向指向的，所以从尾到头打印可以借助栈，栈的特点是先进后出，所以从头节点开始遍历入栈，然后出栈
 */
public class PrintListReverse {
    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        PrintListReverse p = new PrintListReverse();

//        while (node1!=null){
//            //if (node1.next!=null){
//                System.out.println(node1.data);
//                node1=node1.next;
//           // }
//        }

        //利用栈的非递归实现
//        printListReverse(node1);
//
//        System.out.println("******************");
//
//        //递归实现
//        printListReverseRc(node1);
//        System.out.println("******************");
        p.reverseList(node1);

    }
    //利用栈的非递归实现
    public static void printListReverse(ListNode headNode) {
        Stack stack = new Stack();
        while (headNode != null) {
            stack.push(headNode.data);
            headNode=headNode.next;
        }
        while (!stack.empty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    //递归实现
    public static void printListReverseRc(ListNode headNode){
        if (headNode!=null){
            if (headNode.next!=null){
                printListReverseRc(headNode.next);
            }
            System.out.println(headNode.data);
        }
    }

    public ListNode reverseList(ListNode head) {
       if (head==null||head.next==null){
           return head;
       }
        ListNode l=reverseList(head.next);
        l.next=head;
        return head;
    }


}



class ListNode{
    int data;
    ListNode next;
    ListNode(int x){
        data = x;
        next = null;
    }
}