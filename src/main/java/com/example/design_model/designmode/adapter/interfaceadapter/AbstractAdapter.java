package com.example.design_model.designmode.adapter.interfaceadapter;
/*
接口适配器模式

定义抽象方法继承接口事先定义的方法，让子类按需实现
 */
public  class AbstractAdapter implements Sourceable{
    @Override
    public void read(){
        System.out.println("父类Abs  read");
    }

    @Override
    public void write() {
        System.out.println("父类Abs  write");

    }
}
