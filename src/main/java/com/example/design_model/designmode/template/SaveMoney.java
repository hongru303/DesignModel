package com.example.design_model.designmode.template;

import java.util.logging.Logger;

/*
具体子类继承抽象模板，实现存钱业务
 */
public class SaveMoney extends AbstractTemplate{
    private final static Logger logger = Logger.getLogger(String.valueOf(SaveMoney.class));
    @Override
    public void handleBusiness() {
        logger.info("SaveMoney");
    }
}
