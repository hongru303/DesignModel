package com.example.design_model.designmode.abstractffactory;
/*
定义电脑工厂
 */
public class ComputerFactroy extends AbstractFactory{
    @Override
    public Computer crateComputer(String brand) {
        if ("HuaWei".equals(brand)){
            return new ComputerHuaWei();
        }else if ("Apple".equals(brand)){
            return new ComputerApple();
        }else return null;
    }

    @Override
    public Phone createPhone(String brand) {
        return null;
    }
}
