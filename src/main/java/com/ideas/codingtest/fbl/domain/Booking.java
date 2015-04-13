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

    private final Integer bookingRefNumber = ThreadLocalRandom.current().nextInt(9999,100000);

    private final DateTime bookingDateTime = new DateTime();

    private final Customer customer;

    private List<Passenger> passengers = new ArrayList<Passenger>();

    private final Airport departureAirport;

    private final Airport arrivalAirport;

    private List<Flight> flights;


    /**
     * Instantiates a new Booking.
     * @param customer the customer
     * @param passengers the passengers
     * @param departureAirport the departure airport
     * @param arrivalAirport the arrival airport
     */
    public Booking(Customer customer, List<Passenger> passengers, Airport departureAirport, Airport arrivalAirport) {
        this.customer = customer;
        this.passengers = passengers;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
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
     * Gets flights.
     *
     * @return the flights
     */
    public List<Flight> getFlights() {
        return flights;
    }

    /**
     * Sets flights.
     *
     * @param flights the flights
     */
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * Gets passengers.

     *
     * @return the passengers
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }

    /**
     * Gets departure airport.
     *
     * @return the departure airport
     */
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Gets arrival airport.
     *
     * @return the arrival airport
     */
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }
}
