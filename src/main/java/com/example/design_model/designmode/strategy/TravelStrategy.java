package com.example.design_model.designmode.strategy;
/*
策略模式为同一个行为定义了不同的策略，并为每种策略都实现了不同的方法
比如吃饭可以吃肉类，蔬菜，水果类
 */
public interface TravelStrategy {
    String travelMode();
}
