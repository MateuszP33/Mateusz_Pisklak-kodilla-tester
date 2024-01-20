package com.kodilla.abstracts.homework;

public class RectangularTriangle extends Shape {
    private int width;
    private int height;

    public RectangularTriangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double area = 0.5 * width * height;
        return area;
    }

    @Override
    public double circuit() {
        double circuit = width + height + (Math.sqrt( Math.pow(width, 2) + Math.pow(height, 2)));
        return circuit;
    }
}
