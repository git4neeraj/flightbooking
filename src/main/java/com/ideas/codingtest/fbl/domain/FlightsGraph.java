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

    public FlightsGraph(List<Vertex> airports, List<Edge> flights) {
        this.airports = airports;
        this.flights = flights;
    }

    public List<Vertex> getAirports() {
        return airports;
    }

    public List<Edge> getFlights() {
        return flights;
    }
}
