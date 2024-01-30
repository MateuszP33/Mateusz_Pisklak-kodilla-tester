package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudentsInClass = new ArrayList<>();

    public School(List<Integer> numberOfStudentsInClass) {
        this.numberOfStudentsInClass = numberOfStudentsInClass;
    }
    public double getSum() {
        int sum = 0;
        for (int number : numberOfStudentsInClass)
            sum += number;
        return sum;
    }

    @Override
    public String toString() {
        return "Number of students in each class" + numberOfStudentsInClass;
    }


}
