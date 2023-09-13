package com.example.design_model.designmode.decorator;
/*
装饰器模式：在无需改变原类的情况下，动态的扩展一个功能
两个类直接继承接口连接起来
直接把原类放到装饰器类里面，增加类装饰器类的功能
 */
//被装饰的类
public class Source implements Sourceable{
    @Override
    public void read() {
        System.out.println("Sourcee    read");
    }
}
