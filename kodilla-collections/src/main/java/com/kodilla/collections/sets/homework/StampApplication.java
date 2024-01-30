package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Name1", 2.4, true));
        stamps.add(new Stamp("Name2", 2.3, false));
        stamps.add(new Stamp("Name3", 2.2, true));
        stamps.add(new Stamp("Name1", 2.4, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
