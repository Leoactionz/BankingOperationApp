package com.kts.apr.lectureTwo.request;

import java.math.BigDecimal;

public class WithdrawRequest {

    private String accountNumber;
    private String pin;
    private BigDecimal amount;
    private String amountType;
    private String narration;

    public WithdrawRequest() {
    } // No argument constructor

    public WithdrawRequest(String accountNumber, String pin, BigDecimal amount, String amountType, String narration) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.amount = amount;
        this.amountType = amountType;
        this.narration = narration;
    }// All argument constructor

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
