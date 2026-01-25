package com.example.factory;

import com.example.payments.Payments;
import com.example.payments.cashPayment;
import com.example.payments.fast_tagPayment;

public class paymentFactory {

    public static Payments createPayment(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Payment type cannot be null");
        }

        switch (type.toUpperCase()) {
            case "CASH":
                return new cashPayment();
            case "FAST_TAG":
                return new fast_tagPayment();
            default:
                throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }
}
