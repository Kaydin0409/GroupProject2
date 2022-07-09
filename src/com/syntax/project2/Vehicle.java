package com.syntax.project2;

abstract public class Vehicle {
    /*
    Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
    which should be returning a price of the Vehicle.
    Create 2 sub classes: Sedan and Truck.
    The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in
    which returned price calculated as following: if weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    double vehiclePrice;
    Vehicle(double vehiclePrice){
        this.vehiclePrice=vehiclePrice;
    };
    abstract public double calculateSalePrice();

}
class Truck extends Vehicle{
    double weight;
    Truck(double vehiclePrice, double weight) {
        super(vehiclePrice);
        this.weight=weight;
    }

    @Override
    public double calculateSalePrice() {
        double salePrice;
        if(weight>2000){
            salePrice=vehiclePrice-(vehiclePrice*.10);
        }else{
            salePrice=vehiclePrice-(vehiclePrice*.20);
        }
        System.out.println("The price of the truck after the discount is:");
        return salePrice;
    }
}
class Sedan extends Vehicle{
    double length;
    Sedan(double vehiclePrice, double length) {
        super(vehiclePrice);
        this.length=length;
    }

    @Override
    public double calculateSalePrice() {
        double salePrice;
        if(length>20){
            salePrice=vehiclePrice-(vehiclePrice*.05);
        }else{
            salePrice=vehiclePrice-(vehiclePrice*.10);
        }
        System.out.println("The price of the sedan after the discount is:");
        return salePrice;
    }
}
