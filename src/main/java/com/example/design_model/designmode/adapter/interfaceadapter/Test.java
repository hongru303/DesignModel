package com.example.design_model.designmode.adapter.interfaceadapter;

public class Test {
    public static void main(String[] args){
        //接口类最大，一般用接口类作为类型
        Sourceable sou1 = new Abstract1();
        Sourceable sou2 = new Abstract2();
        sou1.write();//子类1  write
        sou2.read();//子类2 read     子类实现了这两个方法，所以可以直接调用

        sou1.read();//父类Abs  read
        sou2.write();//父类Abs  write    因为子类没有实现这两个方法，所以调用的是父类的方法
    }
}
