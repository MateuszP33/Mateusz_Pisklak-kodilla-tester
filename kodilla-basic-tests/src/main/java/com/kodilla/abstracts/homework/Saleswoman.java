package com.kodilla.abstracts.homework;

public class Saleswoman extends Job {
    private int salary;
    public String[] responsibilities;

    public Saleswoman(int salary) {
        this.salary = salary;
        responsibilities = new String[]{"selling", "helping customers", "putting out the goods"};
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void showResponsibilities() {
        System.out.println("Saleswoman responsibilities are:");
        for (int i = 0; i < 3; i++) {
            System.out.println(responsibilities[i]);
        }
    }
}
