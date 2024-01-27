package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Dacia dacia = new Dacia(120);
        doRace(dacia);
        Mercedes mercedes = new Mercedes(150);
        doRace(mercedes);
        Kia kia = new Kia(170);
        doRace(kia);
    }

    private static void doRace(Car car) {
        for (int i = 0; i <= 3; i++) {
            car.increaseSpeed();
        }
        car.getSpeed();
        for (int i = 0; i <= 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println("This car speed is " + car.getSpeed());
    }
}
