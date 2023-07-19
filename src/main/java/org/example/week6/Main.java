package org.example.week6;

public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle instance
        Vehicle vehicle = new Vehicle("Toyota", 2022);
        vehicle.accelerate(); // Output: Vehicle accelerating
        vehicle.brake(); // Output: Vehicle braking
        System.out.println(vehicle); // Output: Manufacturer: Toyota, Year: 2022

        // Creating a Car instance
        Car car = new Car("Honda", 2023, 4);
        car.accelerate(); // Output: Vehicle accelerating
        car.brake(); // Output: Vehicle braking
        car.openDoors(); // Output: Opening car doors
        System.out.println(car); // Output: Manufacturer: Honda, Year: 2023


        // Creating a Rectangle instance
        Shape rectangle = new Rectangle(5, 10);
        rectangle.display(); // Output: Rectangle - Width: 5.0, Height: 10.0
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea); // Output: Rectangle Area: 50.0

        // Creating a Circle instance
        Shape circle = new Circle(3);
        circle.display(); // Output: Circle - Radius: 3.0
        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea); //
    }
}

