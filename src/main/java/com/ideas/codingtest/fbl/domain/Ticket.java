package com.ideas.codingtest.fbl.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Neeraj on 4/27/2015.
 */
public class Ticket {

    private List<Flight> flightList;

    double lower = 2000.00;
    double upper = 50000.00;
    // Just a random dummy value as cost of ticket
    BigDecimal amount = new BigDecimal(Math.random() * (upper - lower) + lower);
    private Payment payment ;

    /**
     * Instantiates a new Ticket.
     *
     * @param flightList the flight list
     */
    public Ticket(List<Flight> flightList) {
        this.flightList = flightList;
        payment= new Payment();
        payment.setAmount(amount);
    }

    /**
     * Gets flight list.
     *
     * @return the flight list
     */
    public List<Flight> getFlightList() {
        return flightList;
    }

    /**
     * Gets payment.
     *
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }
}
