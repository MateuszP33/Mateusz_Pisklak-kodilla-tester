package com.kodilla.abstracts.homework;

public class Aplication {
    public static void main(String[] args) {

        Circle circle = new Circle(8);
        RectangularTriangle triangle = new RectangularTriangle(3, 4);
        Square square = new Square(4, 5);
        System.out.println(circle.area() + " " + circle.circuit());
        System.out.println(triangle.area() + " " + triangle.circuit());
        System.out.println(square.area() + " " + square.circuit());
    }
}
