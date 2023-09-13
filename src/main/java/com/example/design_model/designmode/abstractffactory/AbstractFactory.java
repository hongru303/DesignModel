package com.example.design_model.designmode.abstractffactory;
/*
抽象工厂模式
 */
//抽象工厂类
public abstract class AbstractFactory {
    public abstract Phone createPhone(String brand);
    public abstract Computer crateComputer(String brand);
}
