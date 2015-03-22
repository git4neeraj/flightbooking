package com.ideas.codingtest.fbl.domain.dijkstra;

/**
 * Created by Neeraj on 3/22/2015.
 */
public interface Edge {

    public String getId();
    public Vertex getArrivalAirport();
    public Vertex getDepartureAirport();
    public int getWeight();

}
