package com.example.design_model.designmode.strategy;

public class TravelByAirStrategy implements TravelStrategy{
    @Override
    public String travelMode() {
        System.out.println("Air");
        return "By Air";
    }
}
