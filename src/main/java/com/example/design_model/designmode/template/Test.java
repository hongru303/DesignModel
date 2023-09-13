package com.example.design_model.designmode.template;

public class Test {
    public static void main(String[] args){
        AbstractTemplate takeMoney = new TakeMoney();
        takeMoney.templateModth();

        AbstractTemplate saveMoney = new SaveMoney();
        saveMoney.templateModth();
    }
}
