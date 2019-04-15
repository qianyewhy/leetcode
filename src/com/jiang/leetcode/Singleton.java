package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/3/20.
 *单例设计模式意思是确保一个类只有一个实例，这个类被成为单例类
 *
 * 饿汉单例设计模式（类初始化就加载对象，加载慢，但是获取对象快）
 * 1、私有化构造函数
 * 2、初始化静态成员变量（本类）
 * 3、提供一个公共的静态方法h获取本类的对象
 *
 * 懒汉单例设计模式
 * 1、私有化构造函数
 * 2、声明类但是不进行实例化
 * 3、判断是否有
 */


//饿汉单例设计模式
class EagerSingleton {
    //类初始化就加载对象，加载慢，但是获取对象快
    private static EagerSingleton eagerinstance = new EagerSingleton();//类加载时初始化
    //保证一个类只能初始化一次
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return eagerinstance;
    }
}


class  LazySingleton{
    //私有化构造函数
    private  LazySingleton(){}
    //声明类变量，但是不进行实例化
    private static LazySingleton lazyinstance;
    //提供公共方法创建类的实例化对象
    public static LazySingleton getInstance(){
        if(lazyinstance== null){
            lazyinstance = new LazySingleton();
        }
        return lazyinstance;
    }
}

class Singleton{
    public static void main(String[] args){
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println("是同一个对象吗"+(e1==e2));

        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        System.out.println("是同一个对象吗"+(s1==s2));

      //  EagerSingleton e3 = new EagerSingleton();


    }

}



