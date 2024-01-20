package com.kodilla.abstracts.homework;

public class Policeman extends Job {
    private int salary;
    public String[] responsibilities;

    public Policeman(int salary) {
        this.salary = salary;
        responsibilities = new String[]{"protecting", "serving"};
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void showResponsibilities() {
        System.out.println("Policeman responsibilities are:");
        for (int i = 0; i < 2; i++) {
            System.out.println(responsibilities[i]);
        }
    }
}
