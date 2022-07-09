package com.syntax.project2;

abstract public class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters
    and the marks in four subjects as its parameters for student B. Test your code
     */

    abstract public double getAverage();
}
class A extends Marks{
    double grade1;
    double grade2;
    double grade3;

    public A(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    @Override
    public double getAverage() {

        System.out.println("The average marks of Student A is:");
        return (grade1+grade2+grade3)/3;
    }
}
class B extends Marks{
    double grade1;
    double grade2;
    double grade3;
    double grade4;

    public B(double grade1, double grade2, double grade3, double grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    @Override
    public double getAverage() {
        System.out.println("The average marks of Student B is:");
        return (grade1+grade2+grade3+grade4)/4;
    }
}
