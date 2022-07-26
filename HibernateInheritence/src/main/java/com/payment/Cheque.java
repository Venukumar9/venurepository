package com.payment;

import javax.persistence.Entity;
import javax.persistence.Column;
@Entity
public class Cheque extends Payment{
    @Column(name = "chequeType")
    private String chequetype;
    public String getChequetype() {

        return chequetype;
    }

    public void setChequetype(String chequetype) {

        this.chequetype = chequetype;
    }
}