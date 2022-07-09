package com.syntax.project2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(), new Square()};

        for(Shape shape:shapes){
            System.out.println(shape.calculateArea(4));
            System.out.println(shape.calculatePerimeter(2));

        }
    }
}
