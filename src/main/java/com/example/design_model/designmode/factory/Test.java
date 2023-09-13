package com.example.design_model.designmode.factory;

import java.util.logging.Logger;

public class Test {
    private static Logger logger = Logger.getLogger(String.valueOf(Test.class));
    public static void main(String[] args){
        Factory fac1 = new Factory();
        Phone huawei = fac1.createPhone("HuaWei");
        Phone apple = fac1.createPhone("Apple");
        logger.info(huawei.brand());
        logger.info(apple.brand());
        apple.brand();
    }
}
