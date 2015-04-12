package com.ideas.codingtest.fbl.business;

import com.ideas.codingtest.fbl.domain.Booking;
import com.ideas.codingtest.fbl.domain.FlightsGraph;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class BookingService {

    private final FlightsGraph flightsGraph;

    public BookingService(FlightsGraph flightsGraph) {
        this.flightsGraph = flightsGraph;
    }

    public void bookFlight() {
     IFlightBookingAlgo bookingAlgo = new DijkstraBasedBookingAlgo(flightsGraph);
        bookingAlgo.execute();

    }
}
