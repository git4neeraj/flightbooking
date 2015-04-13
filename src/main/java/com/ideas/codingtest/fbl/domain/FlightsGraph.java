package com.ideas.codingtest.fbl.domain;

import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;

import java.util.List;

/**
 * Created by Neeraj on 4/12/2015.
 */
public class FlightsGraph {
    private final List<Vertex> airports;
    private final List<Edge> flights;

    /**
     * Instantiates a new Flights graph.
     *
     * @param airports the airports
     * @param flights the flights
     */
    public FlightsGraph(List<Vertex> airports, List<Edge> flights) {
        this.airports = airports;
        this.flights = flights;
    }

    /**
     * Gets airports.
     *
     * @return the airports
     */
    public List<Vertex> getAirports() {
        return airports;
    }

    /**
     * Gets flights.
     *
     * @return the flights
     */
    public List<Edge> getFlights() {
        return flights;
    }
}
