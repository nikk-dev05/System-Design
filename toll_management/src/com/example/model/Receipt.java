package com.example.model;

import java.time.LocalDateTime;

public class Receipt {

    private final String vehicleType;
    private final String paymentType;
    private final double amount;
    private final LocalDateTime timestamp;

    public Receipt(String vehicleType, String paymentType, double amount) {
        this.vehicleType = vehicleType;
        this.paymentType = paymentType;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
