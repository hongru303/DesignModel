package com.example.design_model.designmode.abstractffactory;

import java.util.logging.Logger;

/*
使用抽象工厂方法,就是多中生产模式的工厂的方法
 */
public class Test {
    private static Logger logger = Logger.getLogger(String.valueOf(Test.class));
    public static void main(String[] args){
        //手机产生
        AbstractFactory phonefactory = new PhoneFactory();
        Phone phoneHuaWei = phonefactory.createPhone("HuaWei");
        Phone phoneApple = phonefactory.createPhone("Apple");
        logger.info(phoneApple.call());
        logger.info(phoneHuaWei.call());

        //电脑产生
        AbstractFactory computerFactroy = new ComputerFactroy();
        Computer computerHuaWei  = computerFactroy.crateComputer("HuaWei");
        Computer computerApple = computerFactroy.crateComputer("Apple");
        logger.info(computerHuaWei.internet());
        logger.info(computerApple.internet());


    }
}
