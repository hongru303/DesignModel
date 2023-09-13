package com.example.design_model.designmode.strategy;

public class Context {
    private TravelStrategy travelStrategy;//定义一个旅游类
    public TravelStrategy getTravelStrategy(){
        return travelStrategy;//返回旅游类
    }

    public void setTravelStrategy(TravelStrategy travelStrategy){
        this.travelStrategy = travelStrategy;//设置旅游类
    }

    public String travelMode(){
        return this.travelStrategy.travelMode();

    }

}
