package com.ideas.codingtest.fbl.domain;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Booking {

    private Integer bookingRefNumber = ThreadLocalRandom.current().nextInt(9999,100000);

    private final DateTime bookingDateTime = new DateTime();

    private Customer customer;

    private List<Passenger> passengers = new ArrayList<Passenger>();


    /**
     * Instantiates a new Booking.
     *
     * @param customer the customer
     * @param passengers the passengers
     */
    public Booking(Customer customer, List<Passenger> passengers) {
        this.customer = customer;
        this.passengers = passengers;
    }

    /**
     * Gets booking ref number.
     *
     * @return the booking ref number
     */
    public Integer getBookingRefNumber() {
        return bookingRefNumber;
    }

    /**
     * Gets booking date time.
     *
     * @return the booking date time
     */
    public DateTime getBookingDateTime() {
        return bookingDateTime;
    }

    /**
     * Gets customer.
     *
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets passengers.
     *
     * @return the passengers
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }
}
