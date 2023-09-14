package com.example.design_model.designmode.decorator;
/*
装饰器类，增加功能的类
与适配器的 接口适配器模式一样，直接把被装饰器类当作参数传进来
 */
public class Decorator implements Sourceable{

    private Source source;//原类
    public Decorator(Source source){//构造方法把原类传进来给私有变量 source
        super();
        this.source = source;//将 source 赋给 Dec类的私有变量
    }

    @Override
    public void read(){
        source.read();//原类的方法
        System.out.println("Dec   read");//增加的方法
    }

    public static void main(String[] args){
        Source source = new Source();
        Sourceable sou = new Decorator(source);//类型总是用接口类
        sou.read();
    }

}
