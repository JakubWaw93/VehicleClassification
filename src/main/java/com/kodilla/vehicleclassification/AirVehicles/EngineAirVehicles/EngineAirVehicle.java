package com.kodilla.vehicleclassification.AirVehicles.EngineAirVehicles;

import com.kodilla.vehicleclassification.AirVehicles.AirVehicle;

public class EngineAirVehicle extends AirVehicle {

    private boolean engineOn;

    public EngineAirVehicle(String allocation, String producer, String model, int productionYear, boolean engineOn) {
        super(allocation, producer, model, productionYear);
        this.engineOn = engineOn;
    }

    public boolean isEngineOn() {
        return engineOn;
    }
    public void start(){
        if(!engineOn){
            engineOn=true;
        } else {
            System.out.println("The engine is already running.");
        }
    }
    public void stop(){
        if(engineOn){
            engineOn=false;
        } else {
            System.out.println("You need to have running engine to turn it off.");
        }
    }
    @Override
    public String toString() {
        String engineStatus;
        if (engineOn) {
            engineStatus = "ON";
        }else{ engineStatus="OFF";
        }
        return "Vehicle{" +
                "\nAllocation='" + getAllocation() + "'," +
                "\nProducer='" + getProducer() + "'," +
                "\nModel='" + getModel() + "'," +
                "\nYear of production=" + getProductionYear() +
                "\nEngine Status=" + engineStatus +
                '}';
    }
}
