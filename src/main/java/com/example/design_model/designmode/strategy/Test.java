package com.example.design_model.designmode.strategy;

import java.util.logging.Logger;

/*
策略模式
 */
public class Test {
    private static Logger logger = Logger.getLogger(String.valueOf(Test.class));
    public static void main(String[] args){

        Context context = new Context();

        TravelStrategy travelStrategy = new TravelByAirStrategy();
        context.setTravelStrategy(travelStrategy);
        logger.info(context.travelMode());
        TravelStrategy travelStrategy1 = new TravelByBusStrategy();
        context.setTravelStrategy(travelStrategy1);
        logger.info(context.travelMode());
    }
}
