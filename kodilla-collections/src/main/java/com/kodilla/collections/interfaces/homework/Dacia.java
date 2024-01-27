package com.kodilla.collections.interfaces.homework;

public class Dacia implements Car {
    int speed;

    public Dacia(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = getSpeed() + 30;
    }

    @Override
    public void decreaseSpeed() {
        speed = getSpeed() -50;
    }
}
