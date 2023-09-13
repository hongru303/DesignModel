package com.example.design_model.designmode.abstractffactory;
/*
定义手机工厂
 */
public class PhoneFactory extends AbstractFactory{
    @Override
    public Phone createPhone(String brand) {
        if ("HuaWei".equals(brand)){
            return new PhoneHuaWei();
        }else if ("Apple".equals(brand)){
            return new PhoneApple();
        }else return null;
    }

    @Override
    public Computer crateComputer(String brand) {
        return null;
    }
}
