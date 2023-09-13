package com.example.design_model.designmode.Singleton;
/*
双重校验锁：指在懒汉模式的基础上做进一步的优化，给静态对象的定义加上 volatile 锁来保证初始化时对象的唯一性，
            在获取对象时通过 synchronized（Singleton.class） 给单例类加锁来保障操作的唯一性
 */
public class Lock2Singleton {
    private volatile static Lock2Singleton singleton;//  1  对象锁
    private Lock2Singleton(){}//私有的构造方法，只能自己调用返回给别人，所有别人不可能调用
    public static Lock2Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){//  2  synchronized 方法锁
                if (singleton == null){
                    singleton = new Lock2Singleton();//返回对象的实例
                }
            }

        }
        return singleton;
    }
}
