package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        int hour = currentDateTime.getHour();
        if (hour <= 6 || hour >= 22) {
            return true;
        } else
            return false;
    }
    @Override
    public String getCarType() {
        return "Sedan";
    }
}
