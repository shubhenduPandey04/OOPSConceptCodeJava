package Inheritance;

public class Vehicle {
    void start(){
        System.out.println("Vehicle Started.");
    }
    void Stop(){
        System.out.println("Vehicle Stopped.");
    }
    void fuelType(){
        System.out.println("Type of fuel.");
    }
}

class Car extends Vehicle{
    @Override
    void fuelType(){
        System.out.println("Desel is filled.");
    }

    void openTrunk(){
        System.out.println("Car trunk opened.");
    }
}

class Bike extends Vehicle{
    @Override
    void fuelType(){
        System.out.println("Petrol is filled.");
    }

    void kickStart(){
        System.out.println("Bike is kick-started.");
    }
}