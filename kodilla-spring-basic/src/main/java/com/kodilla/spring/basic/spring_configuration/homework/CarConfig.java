package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Random;

@Configuration
public class CarConfig {
    @Bean
    public Car seasonAndLights() {
        Car car = null;
        LocalDateTime currentDateTime = LocalDateTime.now();
        int month = currentDateTime.getMonthValue();
        int hour = currentDateTime.getHour();
        switch (month) {
            case 12:
            case 1:
            case 2:
                car = new SUV();
                break;
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
                car = new Sedan();
                break;
            case 6:
            case 7:
            case 8:
                car = new Cabrio();
                break;
            default:
        }
        return car;
    }
}
