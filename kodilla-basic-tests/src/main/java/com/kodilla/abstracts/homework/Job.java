package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String[] responsibilities;

    public abstract String[] getResponsibilities();

    public abstract void showResponsibilities();
}
