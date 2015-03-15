package com.ideas.codingtest.fbl.domain;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Flight {

    private final List<Booking> bookings = new LinkedList<>();
    private String number;
    private Date departureTime;
    private Date arrivalTime;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Plane plane;

    /**
     * Instantiates a new Flight.
     *
     * @param builder the builder
     */
    public Flight(Builder builder) {
        this.number = builder.number;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.departureAirport = builder.departureAirport;
        this.arrivalAirport = builder.arrivalAirport;
        this.plane = builder.plane;
    }


    /**
     * Gets number.
     *
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     */
    public void setNumber(String number) {
        this.number = number;
    }


    /**
     * The type Builder.
     */
    public static class Builder {

        private String number;

        private Date departureTime;

        private Date arrivalTime;

        private Airport departureAirport;

        private Airport arrivalAirport;

        private Plane plane;


        /**
         * Instantiates a new Builder.
         *
         * @param number the number
         * @param plane the plane
         * @param arrivalAirport the arrival airport
         * @param departureAirport the departure airport
         * @param arrivalTime the arrival time
         * @param departureTime the departure time
         */
        public Builder(String number, Plane plane, Airport arrivalAirport, Airport departureAirport, Date arrivalTime, Date departureTime) {
            this.number = number;
            this.plane = plane;
            this.arrivalAirport = arrivalAirport;
            this.departureAirport = departureAirport;
            this.arrivalTime = arrivalTime;
            this.departureTime = departureTime;
            this.plane = plane;
        }

        /**
         * Number builder.
         *
         * @param number the number
         * @return the builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Departure time.
         *
         * @param departureTime the departure time
         * @return the builder
         */
        public Builder departureTime(Date departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        /**
         * Arrival time.
         *
         * @param arrivalTime the arrival time
         * @return the builder
         */
        public Builder arrivalTime(Date arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        /**
         * Departure airport.
         *
         * @param departureAirport the departure airport
         * @return the builder
         */
        public Builder departureAirport(Airport departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }

        /**
         * Arrival airport.
         *
         * @param arrivalAirport the arrival airport
         * @return the builder
         */
        public Builder arrivalAirport(Airport arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }

        /**
         * Plane builder.
         *
         * @param plane the plane
         * @return the builder
         */
        public Builder plane(Plane plane) {
            this.plane = plane;
            return this;
        }

        /**
         * Build flight.
         *
         * @return the flight
         */
        public Flight build() {
            return new Flight(this);
        }
    }

}
