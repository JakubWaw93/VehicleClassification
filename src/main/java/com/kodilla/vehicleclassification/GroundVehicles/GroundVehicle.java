package com.kodilla.vehicleclassification.GroundVehicles;

import com.kodilla.vehicleclassification.Vehicle;

public class GroundVehicle extends Vehicle {
    public GroundVehicle(String allocation, String producer, String model, int productionYear) {
        super(allocation, producer, model, productionYear);
    }
    public void drive(){
        System.out.println("This vehicle can drive.");
    }
}
