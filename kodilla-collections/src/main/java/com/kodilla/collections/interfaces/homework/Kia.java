package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    int speed;

    public Kia(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = getSpeed() + 70;
    }

    @Override
    public void decreaseSpeed() {
        speed = getSpeed() -70;
    }
}
