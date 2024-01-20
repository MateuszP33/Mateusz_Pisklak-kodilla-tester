package com.kodilla.abstracts.homework;

public class Person {
    String firstname;
    int age;
    Job job;

    public Person(String firstname, int age, Job job) {
        this.firstname = firstname;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
        job.showResponsibilities();
    }

//Sprawdzenie
    public static void main(String[] args) {
        Job doctor = new Doctor(6000);
        Job saleswoman = new Saleswoman(3000);
        Job policeman = new Policeman(5000);
        Person person1 = new Person("Jim", 32, doctor);
        Person person2 = new Person("Ana", 22, saleswoman);
        Person person3 = new Person("Alex", 42, policeman);
        person1.showResponsibilities();
        person2.showResponsibilities();
        person3.showResponsibilities();
    }
}