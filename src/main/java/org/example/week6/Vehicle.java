package org.example.week6;

public class Vehicle {
    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public void accelerate() {
        System.out.println("Vehicle accelerating");
    }

    public void brake() {
        System.out.println("Vehicle braking");
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Year: " + year;
    }
}

