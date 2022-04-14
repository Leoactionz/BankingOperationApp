package com.kts.apr.lectureTwo.request;

import java.math.BigDecimal;

public class DepositRequest {

    private String accountName;
    private String signature;
    private BigDecimal amount;
    private String narration;

    public DepositRequest() {
    } // No argument constructor

    public DepositRequest(String accountName, String signature, BigDecimal amount, String narration) {
        this.accountName = accountName;
        this.signature = signature;
        this.amount = amount;
        this.narration = narration;
    }// All argument constructor

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
