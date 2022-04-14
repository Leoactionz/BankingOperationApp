package com.kts.apr.lectureTwo.request;

import java.math.BigDecimal;

public class BillPaymentRequest {

    private String biller;
    private String type;
    private BigDecimal amount;
    private String product;
    private String pin;

    public String getBiller() {
        return biller;
    }

    public void setBiller(String biller) {
        this.biller = biller;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String utility) {
        this.product = utility;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
