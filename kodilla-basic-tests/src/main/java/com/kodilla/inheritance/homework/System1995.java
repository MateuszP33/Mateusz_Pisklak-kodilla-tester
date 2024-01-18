package com.kodilla.inheritance.homework;

public class System1995 extends OperatingSystem {

    public System1995(int publicationDate) {
        super(publicationDate);
    }
    public void turnOn() {
        System.out.println("System " + publicationDate + " is opening");
    }
    public void turnOff() {
        System.out.println("System " + publicationDate + " says goodbye");
    }
}
