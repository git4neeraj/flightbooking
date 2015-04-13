package com.ideas.codingtest.fbl.business;

import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Neeraj on 4/12/2015.
 */
public interface IFlightBookingAlgo {

    /**
     * Execute void.
     *
     * @param sourceAirport the source airport
     */
    public void execute(Vertex sourceAirport);

    /**
     * Gets cost effective path.
     *
     * @param target the target
     * @return the cost effective path
     */
    public List<Vertex> getCostEffectivePath(Vertex target);

}
