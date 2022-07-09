package com.syntax.project2;

public class MarksTester {
    public static void main(String[] args) {
        Marks[] marks={new A(98,92,96),new B(88,92,93,98)};

        for(Marks mark:marks){
            System.out.println(mark.getAverage());
        }

    }
}
