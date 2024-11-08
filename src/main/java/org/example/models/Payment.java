package org.example.models;


public class Payment {
    private Long id;
    private String amount;
    private String description;
    private String paymentType;
    private String moneyType;

    public Payment() {
    }

    public Payment(Long id, String amount, String description, String paymentType, String moneyType) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.paymentType = paymentType;
        this.moneyType = moneyType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }
}
