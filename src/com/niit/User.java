package com.niit;

public class User {
    private String accountNo;
    private String name;
    private String password;
    private Double amount;

    public User(String accountNo, String name, String password, Double amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.password = password;
        this.amount = amount;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
