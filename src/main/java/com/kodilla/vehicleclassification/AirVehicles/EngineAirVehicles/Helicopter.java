package com.kodilla.vehicleclassification.AirVehicles.EngineAirVehicles;

public class Helicopter extends EngineAirVehicle{

    public Helicopter(String allocation, String producer, String model, int productionYear, boolean engineOn) {
        super(allocation, producer, model, productionYear, engineOn);
    }

    //test
    public static void main(String[] args) {
        Helicopter newHelicopter = new Helicopter("Air", "Suzuki", "Kamikaze3000", 2020, true );
        System.out.println(newHelicopter);
        newHelicopter.stop();
        System.out.println(newHelicopter);
        newHelicopter.stop();
        newHelicopter.fly();
    }
}
