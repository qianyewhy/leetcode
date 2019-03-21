package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/3/20.
 *
 * 饿汉单例设计模式
 * 1、私有化构造函数
 * 2、初始化静态成员变量（本类）
 * 3、提供一个公共的静态方法h获取本类的对象
 */


//饿汉单例设计模式
public class Single {
    private static final Single instance = new Single();//类加载时初始化
    private Single(){}
    public static Single getInstance(){
        return instance;
    }
}




