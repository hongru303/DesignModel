package com.example.design_model.designmode.strategy;

public class TravelByBusStrategy implements TravelStrategy{
    @Override
    public String travelMode() {
        System.out.println("Bus");

        return "By Bus";
    }
}
