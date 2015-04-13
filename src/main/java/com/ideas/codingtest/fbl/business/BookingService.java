package com.ideas.codingtest.fbl.business;

import com.ideas.codingtest.fbl.domain.Booking;
import com.ideas.codingtest.fbl.domain.Flight;
import com.ideas.codingtest.fbl.domain.FlightsGraph;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;

import java.util.List;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class BookingService {

    private final FlightsGraph flightsGraph;

    /**
     * Instantiates a new Booking service.
     *
     * @param flightsGraph the flights graph
     */
    public BookingService(FlightsGraph flightsGraph) {
        this.flightsGraph = flightsGraph;
    }

    /**
     * Book flight.
     *
     * @param booking the booking
     * @return the list
     */
    public List<Vertex> bookFlight(Booking booking) {
     IFlightBookingAlgo bookingAlgo = new DijkstraBasedBookingAlgo(flightsGraph);
        bookingAlgo.execute(booking.getDepartureAirport());
        List<Vertex> flights= bookingAlgo.getCostEffectivePath(booking.getArrivalAirport());

        return flights;
    }
}
