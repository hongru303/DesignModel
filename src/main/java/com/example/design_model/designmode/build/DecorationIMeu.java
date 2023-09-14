package com.example.design_model.designmode.build;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class DecorationIMeu implements IMeu{

    private List<String> list;

    private BigDecimal sum = BigDecimal.ZERO;

    public DecorationIMeu(){

    }

    public DecorationIMeu(List<String> list, BigDecimal sum){
        this.list = list;
        this.sum = sum;
    }

    @Override
    public IMeu appendBrand(Phone phone){
        list.add(phone.brand());
        sum.add(phone.price());
        return this;
    }

    @Override
    public IMeu addendPrice(Phone phone) {
        list.add(phone.brand());
        sum.add(phone.price());
        return this;
    }
}
