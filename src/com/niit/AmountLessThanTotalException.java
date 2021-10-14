package com.niit;

public class AmountLessThanTotalException extends Exception {
    public AmountLessThanTotalException() {
        super("Vui long nhap so tien nho hon so tien trong cay ATM");
    }
}
