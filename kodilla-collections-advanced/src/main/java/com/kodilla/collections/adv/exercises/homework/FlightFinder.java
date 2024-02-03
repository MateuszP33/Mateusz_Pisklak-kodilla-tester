package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {


    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = FlightRepository.getFlightTable();
        List<Flight> departures = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)){
                departures.add(flight);}
        }
        return departures;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights = FlightRepository.getFlightTable();
        List<Flight> arrivals = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)){
            arrivals.add(flight);}
        }
        return arrivals;
    }
}


