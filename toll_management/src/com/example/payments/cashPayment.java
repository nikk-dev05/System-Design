package com.example.payments;

public class cashPayment implements  Payments{
    @Override
    public String getPaymentType() {
        return "CASH";
    }

    @Override
    public void pay(double amount) {
        System.out.println("AMOUNT"+"->" +amount);
    }
}
