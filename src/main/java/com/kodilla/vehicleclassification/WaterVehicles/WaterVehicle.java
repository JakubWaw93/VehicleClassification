package com.kodilla.vehicleclassification.WaterVehicles;

import com.kodilla.vehicleclassification.Vehicle;

public class WaterVehicle extends Vehicle {
    public WaterVehicle(String allocation, String producer, String model, int productionYear) {
        super(allocation, producer, model, productionYear);
    }
    public void swim(){
        System.out.println("This vehicle can swim.");
    }
}
