package com.example.design_model.designmode.build;

import java.math.BigDecimal;

public class hw implements Phone{


    @Override
    public String brand() {
        return "hw";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(6999);
    }
}
