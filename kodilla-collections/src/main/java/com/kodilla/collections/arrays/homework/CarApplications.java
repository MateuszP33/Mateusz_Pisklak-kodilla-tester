package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Dacia;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarApplications {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
        ;

    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);     // possible values: 0, 1, 2
        if (drawnCarKind == 0) {
            Dacia dacia = new Dacia(150+ getRandomIncreaseSpeed(random));
            return dacia;
        } else if (drawnCarKind == 1) {
            Mercedes mercedes = new Mercedes(150+ getRandomIncreaseSpeed(random));
            return mercedes;
        } else {
            Kia kia= new Kia(170+ getRandomIncreaseSpeed(random));
            return kia;
        }
    }

    private static int getRandomIncreaseSpeed(Random random) {
        int inCreaseSpeed = random.nextInt(110)*1+1 ;
        return inCreaseSpeed;
    }
}
