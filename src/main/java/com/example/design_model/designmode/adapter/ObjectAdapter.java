package com.example.design_model.designmode.adapter;

/*
对象适配器模式：直接把要继承的类当作参数传进来类里面
在适配的类上添加了一个方法
 */

public class ObjectAdapter implements Targetable{
    private Source source;
    public ObjectAdapter (Source source){
        super();
        this.source = source;//直接把类传进来赋给定义的私有变量 source
    }

    @Override
    public void read() {
        System.out.println("Obj   read");//sou原类里面没有的方法，所以补上
    }

    @Override
    public void write() {
        source.write();//因为这是原类里面的方法，直接调用，所以两个方法全有了
    }

    public static void main(String[] args){
        Source source = new Source();
        Targetable tar = new ObjectAdapter(source);
        tar.write();
        tar.read();
    }
}
