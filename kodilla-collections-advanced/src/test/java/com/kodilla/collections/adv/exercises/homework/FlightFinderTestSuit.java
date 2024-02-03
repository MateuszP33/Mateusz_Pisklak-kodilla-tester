package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuit {
    @Test
    public void testFindFlightsFrom() {
        FlightFinder warsaw = new FlightFinder();
        List<Flight> result =warsaw.findFlightsFrom("Warszawa");
        List<Flight> expected = List.of( new Flight("Warszawa", "Kraków"),new Flight("Warszawa", "Gdańsk"));
        assertEquals(expected, result);
    }
    @Test
    public void testFindFlightsTo() {
        FlightFinder cracow = new FlightFinder();
        List<Flight> result =cracow.findFlightsTo("Kraków");
        List<Flight> expected = List.of( new Flight("Warszawa", "Kraków"),new Flight("Radom", "Kraków"));
        assertEquals(expected, result);
    }
    @Test
    public void testFindFlightsToExpectedNull() {
        FlightFinder jemen = new FlightFinder();
        List<Flight> result =jemen.findFlightsTo("Jemen");
        List<Flight> expected = new ArrayList<>(Collections.emptyList());
        assertEquals(expected, result);
    }
    @Test
    public void testFindFlightsFromExpectedNull() {
        FlightFinder jemen = new FlightFinder();
        List<Flight> result =jemen.findFlightsFrom("Jemen");
        List<Flight> expected = new ArrayList<>(Collections.emptyList());
        assertEquals(expected, result);
    }
}
