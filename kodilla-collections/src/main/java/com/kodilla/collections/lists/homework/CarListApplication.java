package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Dacia;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Dacia dacia = new Dacia(120);
        Mercedes mercedes = new Mercedes(150);
        cars.add(dacia);
        cars.add(mercedes);
        cars.add(new Kia(170));

        cars.remove(0);
        cars.remove(mercedes);

        System.out.println(cars.size());
        for(Car car: cars){
            describeCar(car);
        }
    }
}
