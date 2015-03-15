package com.ideas.codingtest.fbl.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Airline {

    private String name = null;

    private final Map<String, Flight> flights = new HashMap<>();


    /**
     * Instantiates a new Airline.
     *
     * @param name the name
     */
    public Airline(final String name) {
        this.setName(name);
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets flights.
     *
     * @return the flights map
     */
    public Map<String, Flight> getFlights() {
        return flights;
    }

    /**
     * Add flight.
     *
     * @param flight the flight
     * @return the flights map
     */
    public Map<String, Flight> addFlight(Flight flight) {
        flights.put(flight.getNumber(),flight);
        return flights;
    }

    /**
     * Delete flight.
     *
     * @param flight the flight
     * @return the flights map
     */
    public Map<String, Flight> deleteFlight(Flight flight) {
        flights.remove(flight.getNumber());
        return flights;
    }
}
