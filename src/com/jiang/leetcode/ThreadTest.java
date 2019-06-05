package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/22.
 */
public class ThreadTest extends Thread{
    //实现子类构造方法，可以缺省
    public ThreadTest(String name){
        super();
        setName(name);
    }

    //重写Thead类中的run方法
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadTest t=new ThreadTest("A");
        t.start();
        System.out.println(Thread.currentThread().toString());
    }
}
