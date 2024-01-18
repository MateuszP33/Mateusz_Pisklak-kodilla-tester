package com.kodilla.inheritance.homework;

public class SystemAplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1990);
        operatingSystem.turnOn();
        System1995 system1995 = new System1995(1995);
        system1995.turnOn();
        System2000 system2000 = new System2000(2000);
        system2000.turnOff();

    }
}
