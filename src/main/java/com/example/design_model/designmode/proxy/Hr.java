package com.example.design_model.designmode.proxy;

//Hr继承公司的接口，代理也要继承公司的接口
public class Hr implements Company{
//    private final static Log logger = LogFactory.getLog(Hr.class);

    @Override
    public void findWorker(String title) {
//        logger.info("i need find a work, title is :  " + title);
        System.out.println("Hr   ---     i need find a work, work name is  : "  + title);

    }
}
