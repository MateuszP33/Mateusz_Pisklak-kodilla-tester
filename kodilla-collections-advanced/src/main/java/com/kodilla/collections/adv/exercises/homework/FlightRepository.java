package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public static List<Flight> getFlightTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Radom", "Kraków"));
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Rzeszów", "Wrocław"));
        flights.add(new Flight("Rzeszów", "Szczecin"));
        flights.add(new Flight("Kraków", "Poznań"));
        return flights;
    }
}
