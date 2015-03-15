package com.ideas.codingtest.fbl.domain;

import java.math.BigDecimal;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Payment {
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal add(BigDecimal augendAmount) {
        return amount.add(augendAmount);
    }

    public BigDecimal subtract(BigDecimal subtrahendAmount) {
        return amount.subtract(subtrahendAmount);
    }

    public BigDecimal negate() {
        return amount.negate();
    }

    public BigDecimal setScale(int newScale, int roundingMode) {
        return amount.setScale(newScale, roundingMode);
    }
}
