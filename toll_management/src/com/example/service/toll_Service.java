package com.example.service;

import com.example.model.Receipt;
import com.example.payments.Payments;
import com.example.vehicles.Vehicle;

public class toll_Service {
    public Receipt processToll(Vehicle vehicle, Payments payment) {

        double amount = vehicle.getTollAmount();
        payment.pay(amount);

        return new Receipt(
                vehicle.getType(),
                payment.getPaymentType(),
                amount
        );
    }
}
