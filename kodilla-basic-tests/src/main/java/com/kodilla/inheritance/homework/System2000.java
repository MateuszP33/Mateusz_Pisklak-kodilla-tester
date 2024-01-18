package com.kodilla.inheritance.homework;

public class System2000 extends OperatingSystem {
    public System2000(int publicationDate) {
        super(publicationDate);
    }

    public void turnOn() {
        System.out.println("Welcome to " + publicationDate + " System");
    }
    public void turnOff() {
        System.out.println("Till next time user system " + publicationDate);
    }

}
