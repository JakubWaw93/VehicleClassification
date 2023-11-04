package com.kodilla.vehicleclassification.AirVehicles;

public class Glider extends AirVehicle{

    public Glider(String allocation, String producer, String model, int productionYear) {
        super(allocation, producer, model, productionYear);
    }

//test
    public static void main(String[] args) {
                Glider newGlider = new Glider("air", "Honda", "NXY77", 1995);
                System.out.println(newGlider);
                newGlider.fly();
    }
}
