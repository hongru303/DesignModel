package com.example.design_model.designmode.Singleton;
/*
静态内部类，单例模式:  静态内部类通过在类中定义一个静态内部类，将对象实例的定义和初始化放在内部类中完成
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();//在静态内部类中实例化对象
    }
    private Singleton(){}//私有的构造方法
    public static final Singleton getInstance(){//公共的方法给外面的类访问
        return SingletonHolder.INSTANCE;//返回的是类的实例
    }
}
