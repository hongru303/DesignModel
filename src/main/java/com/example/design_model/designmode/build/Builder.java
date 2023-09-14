package com.example.design_model.designmode.build;

/**
 * 建造者模式
 */

public class Builder {

    public IMeu sub1(){
        Phone pg = new pg();
        System.out.println(new DecorationIMeu().appendBrand(pg).addendPrice(pg).toString());
        return new DecorationIMeu().appendBrand(pg).addendPrice(pg);
    }

    public IMeu sub2(){
        Phone hw = new hw();
        System.out.println(new DecorationIMeu().appendBrand(hw).addendPrice(hw).toString());
        return new DecorationIMeu().appendBrand(hw).addendPrice(hw);
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.sub1();
        builder.sub2();
    }
}
