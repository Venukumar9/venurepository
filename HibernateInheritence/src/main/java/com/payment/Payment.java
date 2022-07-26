package com.payment;

import javax.persistence.*;
@Entity
@Table(name = "payment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ptype", discriminatorType = DiscriminatorType.STRING,length =20)

public class Payment {
    @Id
    @Column(name = "pid")

    private int pid;
    @Column(name = "amount")
    private double amount;
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
