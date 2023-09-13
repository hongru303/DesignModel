package com.example.design_model.designmode;

/*
设计模式之工厂模式：
定义了一个创建对象的接口，但由子类决定要实例化但类是哪一个✅
工厂方法让类把实例化推迟到子类
通过让子类来决定创建什么对象来实现对象的封装的目的✅
把一个经常需要变换的地方从类中单独抽离出来新建成一个类，需要的时候类再从新类中调用。
当以后要需要改变时也只需改变这个类
实现类一个接口
类变成新类的客户


先实现一个抽象类父类PizzaStore
PizzaStore类里面再定义一个抽象方法createPizza
加盟店纽约风味和北京风味继承这个父类PizzaStore
在加盟店这个子类里决定生产哪一种风味的披萨

 */

public class note {
    public static void main(String[] args){
    }
}
