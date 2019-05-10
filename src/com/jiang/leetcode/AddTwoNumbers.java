package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/9.
 * 题目：
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

*
 * 思路：
 * 第一种（最优）：先求和再进位
 * 按位先求和，然后再判断每位值是否大于9，大于9就进位，不然就直接赋值
 * 第二种：一步到位，一位一位的计算，场景太多，覆盖不全，if else太多，基本算是枚举类型了
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=null;
        ListNode tail=null;
        int key=0;
        int t=0;
        ListNode finalhead=null;
        ListNode finaltail=null;
        //第一步：两个链表对应位上求和
        while (l1!=null&&l2!=null){
            t=l1.val+l2.val;
            ListNode temp=new ListNode(t);
            if (sum==null){
                sum=tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
            }
            if (l1.next!=null&&l2.next==null){
                tail.next=l1.next;
                tail=l1.next;
            }
            if (l1.next==null&&l2.next!=null){
                tail.next=l2.next;
                tail=l2.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        //得到的和链表，判断每位的值是否大于9
        while (sum!=null){
            if (sum.val>9){
                int a=sum.val/10;
                int b=sum.val%10;
                sum.val=b;
                if (sum.next!=null){
                    sum.next.val+=a;
                }else {
                    ListNode d=new ListNode(a);
                    sum.next=d;
                }
            }
            ListNode temp=new ListNode(sum.val);
            if (finalhead==null){
                finalhead=finaltail=temp;
            }else {
                finaltail.next=temp;
                finaltail=temp;
            }
            sum=sum.next;
        }
        return finalhead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
//        ListNode node2 = new ListNode(4);
//        ListNode node3 = new ListNode(3);
//        l1.next = node2;
//        node2.next = node3;

        ListNode l2 = new ListNode(9);
        ListNode node4 = new ListNode(9);
//        ListNode node5 = new ListNode(4);
        l2.next = node4;
//        node4.next = node5;

        AddTwoNumbers a=new AddTwoNumbers();
        ListNode sum=a.addTwoNumbers(l1,l2);
        while (sum!=null){
            System.out.println(sum.val);
            sum=sum.next;
        }
    }
}
