package com.example.design_model.designmode.template;

import java.util.logging.Logger;

/*
继承抽象模板实现取钱业务
 */
public class TakeMoney extends AbstractTemplate{
    private final static Logger logger = Logger.getLogger(String.valueOf(TakeMoney.class));
    @Override
    public void handleBusiness() {
        logger.info("TakeMoney");
    }
}
