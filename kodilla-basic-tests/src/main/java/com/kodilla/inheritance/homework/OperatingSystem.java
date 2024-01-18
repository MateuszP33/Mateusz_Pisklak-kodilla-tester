package com.kodilla.inheritance.homework;

public class OperatingSystem {
    public int publicationDate;

    public OperatingSystem(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void turnOn() {
        System.out.println("System " + publicationDate + " on");
    }

    public void turnOff() {
        System.out.println("System " + publicationDate + " off");
    }
}
