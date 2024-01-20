package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    private int salary;
    public String[] responsibilities;

    public Doctor(int salary) {
        this.salary = salary;
        responsibilities = new String[]{"treating", "admitting patients", "helping"};
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void showResponsibilities() {
        System.out.println("Doctors responsibilities are:");
        for (int i = 0; i < 3; i++) {
            System.out.println(responsibilities[i]);
        }
    }
}
