package com.syntax.project2;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */


    double calculateArea(double num);

    double calculatePerimeter(double num);
}
class Circle implements Shape{
   @Override
    public double calculateArea(double radius) {
       System.out.println("The area of the circle is:");
       return Math.PI*(Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter(double radius) {
        System.out.println("The perimeter of the circle is:");
        return 2*Math.PI*radius;
    }
}
class Square implements Shape{
    @Override
    public double calculateArea(double a) {
        System.out.println("The area of the square is:");
        return Math.pow(a,2);
    }

    @Override
    public double calculatePerimeter(double a) {
        System.out.println("The perimeter of the square is:");
        return 4*a;
    }
}
