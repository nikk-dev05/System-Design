package com.example.vehicles;

public class car implements  Vehicle{
    @Override
    public String getType() {
        return "CAR";
    }

    @Override
    public double getTollAmount() {
        return 100.0;
    }
}

