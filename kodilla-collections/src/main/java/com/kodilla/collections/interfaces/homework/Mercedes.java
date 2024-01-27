package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {
    int speed;

    public Mercedes(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int speed = getSpeed() + 50;
    }

    @Override
    public void decreaseSpeed() {
        int speed = getSpeed() -80;
    }
}
