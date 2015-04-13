package com.ideas.codingtest.fbl.domain.dijkstra;

/**
 * Created by Neeraj on 3/22/2015.
 */
public interface Edge {

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId();

    /**
     * Gets arrival airport.
     *
     * @return the arrival airport
     */
    public Vertex getArrivalAirport();

    /**
     * Gets departure airport.
     *
     * @return the departure airport
     */
    public Vertex getDepartureAirport();

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public int getWeight();

}
