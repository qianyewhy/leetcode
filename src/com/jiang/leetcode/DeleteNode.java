package com.jiang.leetcode;
import java.util.*;

/**
 * Created by jiangxin on 2019/4/27.
 * Java重要类之LinkList类详解-----https://blog.csdn.net/shengmingqijiquan/article/details/52640584
 * 官方文档：http://tool.oschina.net/uploads/apidocs/jdk-zh/java/util/LinkedList.html
 * java实现单链表常规操作-----https://www.cnblogs.com/bjh1117/p/8335108.html
 */
public class DeleteNode {
    public void deletecode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }


    public static void main(String[] args) {

        LinkedList<Integer> head=new LinkedList<Integer>();
        head.add(1);
        head.add(5);
        head.add(3);

        head.removeFirstOccurrence(3);
        for (Integer i:head){
            System.out.println(i);
        }
    }
}
