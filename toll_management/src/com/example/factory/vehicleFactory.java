package com.example.factory;


import com.example.vehicles.Vehicle;
import com.example.vehicles.bike;
import com.example.vehicles.car;

public class vehicleFactory {
    public static Vehicle createVehicle(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Vehicle type cannot be null");
        }

        switch (type.toUpperCase()) {
            case "CAR":
                return new car();
            case "BIKE":
                return new bike();
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + type);
        }
    }
}
