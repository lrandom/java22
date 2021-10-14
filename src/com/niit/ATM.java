package com.niit;

public class ATM {
    float total = 1000000;

    public void withdraw(float amount) throws AmountLessThanTotalException {
        if (amount > total) {
            throw new AmountLessThanTotalException();
        }
        total -= amount;
    }

    public float getAmountRemind() {
        return this.total;
    }
}
