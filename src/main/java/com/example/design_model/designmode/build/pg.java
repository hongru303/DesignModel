package com.example.design_model.designmode.build;

import java.math.BigDecimal;

public class pg implements Phone{
    @Override
    public String brand() {
        return "pg";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(7999);
    }
}
