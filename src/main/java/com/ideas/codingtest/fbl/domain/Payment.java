package com.ideas.codingtest.fbl.domain;

import java.math.BigDecimal;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Payment {
    private BigDecimal amount;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Add big decimal.
     *
     * @param augendAmount the augend amount
     * @return the big decimal
     */
    public BigDecimal add(BigDecimal augendAmount) {
        return amount.add(augendAmount);
    }

    /**
     * Subtract big decimal.
     *
     * @param subtrahendAmount the subtrahend amount
     * @return the big decimal
     */
    public BigDecimal subtract(BigDecimal subtrahendAmount) {
        return amount.subtract(subtrahendAmount);
    }

    /**
     * Negate big decimal.
     *
     * @return the big decimal
     */
    public BigDecimal negate() {
        return amount.negate();
    }

    /**
     * Sets scale.
     *
     * @param newScale the new scale
     * @param roundingMode the rounding mode
     * @return the scale
     */
    public BigDecimal setScale(int newScale, int roundingMode) {
        return amount.setScale(newScale, roundingMode);
    }
}
