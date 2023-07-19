package org.example.week6;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String manufacturer, int year, int numDoors) {
        super(manufacturer, year);
        this.numDoors = numDoors;
    }

    public void openDoors() {
        System.out.println("Opening car doors");
    }
}
