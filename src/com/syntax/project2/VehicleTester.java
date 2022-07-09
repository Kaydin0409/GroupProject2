package com.syntax.project2;

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle[] vehicles={new Truck(50000,2500),new Sedan(20000,22)};

        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle.calculateSalePrice());
        }
    }
}
