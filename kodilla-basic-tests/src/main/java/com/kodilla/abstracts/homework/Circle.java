package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double circuit() {
        double circuit = 2 * Math.PI * radius;
        return circuit;
    }
}
