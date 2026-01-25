package com.example.payments;

public class fast_tagPayment implements Payments{
    @Override
    public void pay(double amount) {
        System.out.println("AMOUNT"+"->"+amount);
    }

    @Override
    public String getPaymentType() {
        return "FAST_TAG";
    }
}
