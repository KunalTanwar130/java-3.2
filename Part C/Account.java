package com.banking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accNo;

    private String name;
    private double balance;

    public int getAccNo() { return accNo; }
    public void setAccNo(int accNo) { this.accNo = accNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
