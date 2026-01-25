package com.example.vehicles;

public class bike implements  Vehicle{
    @Override
    public String getType() {
        return "BIKE";
    }

    @Override
    public double getTollAmount() {
        return 50.0;
    }
}

