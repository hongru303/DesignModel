package com.example.design_model.designmode.Singleton;
/*
单例模式：保证系统实例唯一性的重要手段，通过类的实例方法私有化防止程序通过其他方法创建该类的实例
        然后通过一个全局唯一获取该类的实例的方法帮助用户获取类的实例

(懒汉模式,线程安全):指在类中直接定义了单例但是并未初始化
 */
public class lazySingletonTest {
    private static lazySingletonTest instance;
    private lazySingletonTest(){//将构造函数私有化(加锁)

    }
    public static synchronized lazySingletonTest getInstance(){//加锁 synchronized
        if (instance == null){
            instance = new lazySingletonTest();
        }
        return instance;
    }

}
