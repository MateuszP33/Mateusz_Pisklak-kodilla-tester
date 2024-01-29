package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Dacia;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
            System.out.println("-----------------------------");
            System.out.println("Car kind: " + getCarName(car));
            System.out.println("Car speed: " + car.getSpeed());

    }
    private static String getCarName(Car car) {
        if (car instanceof Dacia)
            return "Dacia";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Kia)
            return "Kia";
        else
            return "Unknown shape name";
    }


}
