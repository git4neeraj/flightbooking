package com.ideas.codingtest.fbl.business;

import com.ideas.codingtest.fbl.domain.FlightsGraph;
import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;

import java.util.*;

/**
 * Created by Neeraj on 4/12/2015.
 */
public class DijkstraBasedBookingAlgo implements IFlightBookingAlgo{
    
    private final List<Vertex> airports;
    
    private final List<Edge> flights;
    
    private Set<Vertex> settledNodes;
   
    private Set<Vertex> unSettledNodes;
   
    private Map<Vertex, Vertex> predecessors;
   
    private Map<Vertex, Integer> airportDistanceMap;

    /**
     * Instantiates a new Flight booking algorithm.
     *
     * @param flightsGraph the flights graph
     */
    public DijkstraBasedBookingAlgo(FlightsGraph flightsGraph) {
        this.airports = new ArrayList<Vertex>(flightsGraph.getAirports());
        this.flights = new ArrayList<Edge>(flightsGraph.getFlights());
    }

    /**
     * Execute void.
     *
     * @param sourceAirport the source
     */
    public void execute(Vertex sourceAirport) {
        settledNodes = new HashSet<Vertex>();
        unSettledNodes = new HashSet<Vertex>();
        airportDistanceMap = new HashMap<Vertex, Integer>();
        predecessors = new HashMap<Vertex, Vertex>();
        airportDistanceMap.put(sourceAirport, 0);
        unSettledNodes.add(sourceAirport);
        while (unSettledNodes.size() > 0) {
            Vertex node = getMinimum(unSettledNodes);
            settledNodes.add(node);
            unSettledNodes.remove(node);
            findMinimalDistances(node);
        }
    }

    /**
     * This method find s minimal distances between the airports
     * @param sourceAirport
     */
    private void findMinimalDistances(Vertex sourceAirport) {
        List<Vertex> adjacentNodes = getNeighbors(sourceAirport);
        for (Vertex destinationAirport : adjacentNodes) {
            if (getShortestDistance(destinationAirport) > getShortestDistance(sourceAirport)
                    + getDistance(sourceAirport, destinationAirport)) {
                airportDistanceMap.put(destinationAirport, getShortestDistance(sourceAirport)
                        + getDistance(sourceAirport, destinationAirport));
                predecessors.put(destinationAirport, sourceAirport);
                unSettledNodes.add(destinationAirport);
            }
        }

    }

    /**
     * Gets the distance
     * @param sourceAirport
     * @param destinationAirport
     * @return
     */
    private int getDistance(Vertex sourceAirport, Vertex destinationAirport) {
        for (Edge flight : flights) {
            if (flight.getDepartureAirport().equals(sourceAirport)
                    && flight.getArrivalAirport().equals(destinationAirport)) {
                return flight.getWeight();
            }
        }
        throw new RuntimeException("Should not happen");
    }

    /**
     * Gets the neighbors
     * @param airport
     * @return
     */
    private List<Vertex> getNeighbors(Vertex airport) {
        List<Vertex> neighbors = new ArrayList<Vertex>();
        for (Edge flight : flights) {
            if (flight.getDepartureAirport().equals(airport)
                    && !isSettled(flight.getArrivalAirport())) {
                neighbors.add(flight.getArrivalAirport());
            }
        }
        return neighbors;
    }

    /**
     * Gets the minimum vertex
     * @param airports
     * @return
     */
    private Vertex getMinimum(Set<Vertex> airports) {
        Vertex minimum = null;
        for (Vertex vertex : airports) {
            if (minimum == null) {
                minimum = vertex;
            } else {
                if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
                    minimum = vertex;
                }
            }
        }
        return minimum;
    }

    /**
     *  Checks if the vertex is setteled
     * @param airport
     * @return boolean
     */
    private boolean isSettled(Vertex airport) {
        return settledNodes.contains(airport);
    }

    /**
     * Gets the shortest distance
     * @param destinationAirport
     * @return int
     */
    private int getShortestDistance(Vertex destinationAirport) {
        Integer d = airportDistanceMap.get(destinationAirport);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    /**
     * Gets path.
     *
     * @param target the target
     * @return the path
     */
/*
     * This method returns the most cost effective path from the source to the selected target and
     * NULL if no path exists
     */
    public LinkedList<Vertex> getCostEffectivePath(Vertex target) {
        LinkedList<Vertex> path = new LinkedList<Vertex>();
        Vertex step = target;
        // check if a path exists
        if (predecessors.get(step) == null) {
            return null;
        }
        path.add(step);
        while (predecessors.get(step) != null) {
            step = predecessors.get(step);
            path.add(step);
        }
        // Put it into the correct order
        Collections.reverse(path);
        return path;
    }
}
