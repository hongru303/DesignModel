package com.example.design_model.designmode.template;

import java.util.logging.Logger;

/*
模板方法模式：定义一个算法框架，并通过继承的方式将算法的实现延迟到子类中，
        使得子类可以在不改变算法框架及其流程的前提下重新定义该算法在某些特定环节的实现
 */
public abstract class AbstractTemplate {
    private final static Logger logger = Logger.getLogger(String.valueOf(AbstractTemplate.class));

    public void templateModth(){//模板方法，用于核心流程和算法的定义
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }
    public void checkNumber(){
        logger.info("抽号");
    }
    public void queueUp(){
        logger.info("排队");
    }
    public abstract void handleBusiness();//因为业务办理有很多种，所以这里应该变成抽象方法让子类去实现具体功能
    public void serviceEvaluation(){
        logger.info("服务评价");
    }
}
