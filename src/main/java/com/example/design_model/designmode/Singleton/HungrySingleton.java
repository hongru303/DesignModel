package com.example.design_model.designmode.Singleton;
/*
饿汉模式，单例模式:定义单例对象的同时将其实例化
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();//在内部直接定义同时实例化
    private HungrySingleton(){}//私有方法的构造函数
    public static HungrySingleton getInstance(){//公共的方法，返回的是类的实例
        return instance;
    }
}
