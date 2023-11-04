package com.kodilla.vehicleclassification.WaterVehicles.EngineWaterVehicles;

import com.kodilla.vehicleclassification.WaterVehicles.WaterVehicle;

public class EngineWaterVehicle extends WaterVehicle {

    private boolean engineOn;

    public EngineWaterVehicle(String allocation, String producer, String model, int productionYear, boolean engineOn) {
        super(allocation, producer, model, productionYear);
        this.engineOn = engineOn;
    }

    public boolean isEngineOn() {
        return engineOn;
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
}
