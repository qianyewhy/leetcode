package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/23.
 * 21. 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

 示例：

 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4
 *链表的尾插法，需要两个指针
 *
 */
public class MergeTwoLists {
    //新建了节点，没有直接拼接了l1l2
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newlist=null;
        ListNode tailer=null;
        ListNode temp=new ListNode(0);
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        if (l1==null&&l2==null){
            return null;
        }
        while (l2!=null||l1!=null){
            if (l1==null){
                tailer.next=l2;
                return newlist;
            }
            if (l2==null){
                tailer.next=l1;
                return newlist;
            }
            if (l1.val<=l2.val){
                temp=new ListNode(l1.val);
                l1=l1.next;
            }else if (l1.val>l2.val){
                temp=new ListNode(l2.val);
                l2=l2.next;
            }
            if (newlist==null){
                newlist=tailer=temp;
            }else {
                tailer.next=temp;
                tailer=temp;
            }

        }
        return newlist;
    }

    //利用递归可以直接拼接，不需要新建节点
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        if (l1==null&&l2==null){
            return null;
        }
        if (l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        MergeTwoLists m=new MergeTwoLists();
        ListNode l1=null;
//        ListNode l1=new ListNode(1);
//        ListNode t1=new ListNode(2);
      //  ListNode t2=new ListNode(4);
        ListNode l2=new ListNode(1);
        ListNode t3=new ListNode(3);
        ListNode t4=new ListNode(4);
      //  l1.next=t1;
      //  t1.next=t2;
        l2.next=t3;
        t3.next=t4;
        ListNode temp=m.mergeTwoLists(l1,l2);
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

    }


}
