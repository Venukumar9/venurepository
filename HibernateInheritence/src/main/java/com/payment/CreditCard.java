package com.payment;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class CreditCard extends Payment{
    @Column(name = "cardType")
    private String creditcardType;
    public String getCreditcardType() {
        return creditcardType;
    }

    public void setCreditcardType(String creditcardType) {
        this.creditcardType = creditcardType;
    }
}