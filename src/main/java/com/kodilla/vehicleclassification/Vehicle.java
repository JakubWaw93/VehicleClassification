package com.kodilla.vehicleclassification;

import java.util.Objects;

public abstract class Vehicle {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return productionYear == vehicle.productionYear && Objects.equals(allocation, vehicle.allocation) && Objects.equals(producer, vehicle.producer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, productionYear);
    }
}

