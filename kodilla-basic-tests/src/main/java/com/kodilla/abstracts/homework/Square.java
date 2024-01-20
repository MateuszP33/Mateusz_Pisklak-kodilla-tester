package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private int width;
    private int height;
    public Square(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double area = width*height;
        return area;
    }

    @Override
    public double circuit() {
        double circuit=(2*width)+(2*height);
        return circuit;
    }
}
