package com.kodilla.vehicleclassification;

public class Vehicle {

    private String allocation;
    private String producer;
    private String model;
    private int productionYear;

    public Vehicle(String allocation, String producer, String model, int productionYear) {
        this.allocation = allocation;
        this.producer = producer;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getAllocation() {
        return allocation;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "\nAllocation='" + allocation + "'," +
                "\nProducer='" + producer + "'," +
                "\nModel='" + model + "'," +
                "\nYear of production=" + productionYear +
                '}';
    }
}

