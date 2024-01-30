package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        Principal Piotr = new Principal("Piotr", "Frączewski");
        Principal Dawid = new Principal("Dawid", "Myśliwiec");
        Principal Head = new Principal("Head", "Master");

        School piotrSchool = new School(Arrays.asList(25, 18, 35, 23, 17));
        School dawidSchool = new School(Arrays.asList(12, 14, 17, 19, 17));
        School headSchool = new School(Arrays.asList(28, 27, 25, 23, 22));

        schools.put(Piotr, piotrSchool);
        schools.put(Dawid, dawidSchool);
        schools.put(Head, headSchool);

        for (Map.Entry<Principal, School> school : schools.entrySet()) {
            System.out.println(school.getKey().getFirstname() + " " + school.getKey().getLastname() + " is principal of school with total number of students: " + school.getValue().getSum());
        }
    }
}
