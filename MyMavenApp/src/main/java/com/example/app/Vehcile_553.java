package com.example.app;

class Vehicle {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void carBrand() {
        System.out.println("This is a Car");
    }
}

class ElectricCar extends Car {
    void batteryType() {
        System.out.println("This is an Electric Car");
    }
}

public class Vehcile_553 {

    public static void main(String[] args) {

        ElectricCar ec = new ElectricCar();

        ec.vehicleType();
        ec.carBrand();      
        ec.batteryType();  
    }
}
