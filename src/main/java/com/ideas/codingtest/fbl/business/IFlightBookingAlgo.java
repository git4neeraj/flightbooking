package com.ideas.codingtest.fbl.business;

import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Neeraj on 4/12/2015.
 */
public interface IFlightBookingAlgo {

    public void execute(Vertex sourceAirport);

    public List<Vertex> getCostEffectivePath(Vertex target);

}
