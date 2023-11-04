package com.kodilla.vehicleclassification.AirVehicles;

import com.kodilla.vehicleclassification.Vehicle;

public class AirVehicle extends Vehicle {

    public AirVehicle(String allocation, String producer, String model, int productionYear) {
        super(allocation, producer, model, productionYear);
    }

    public void fly(){
        System.out.println("This vehicle can fly.");
    }

}
