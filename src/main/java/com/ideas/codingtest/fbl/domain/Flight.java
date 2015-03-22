package com.ideas.codingtest.fbl.domain;

import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * The type Flight.
 */
public class Flight implements Edge {

    private final List<Booking> bookings = new LinkedList<>();

    private String name;

    private String id;

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
        this.name = builder.name;
        this.id=builder.id;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.departureAirport = builder.departureAirport;
        this.arrivalAirport = builder.arrivalAirport;
        this.plane = builder.plane;
    }


    @Override
    public String getId() {
        return null;
    }



    @Override
    public Vertex getArrivalAirport() {
        return null;
    }

    @Override
    public Vertex getDepartureAirport() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }


    /**
     * The type Builder.
     */
    public static class Builder {

        private String name;

        private String id;

        private Date departureTime;

        private Date arrivalTime;

        private Airport departureAirport;

        private Airport arrivalAirport;

        private Plane plane;


        /**
         * Instantiates a new Builder.
         *
         * @param name the name
         * @param id the id
         * @param plane the plane
         * @param arrivalAirport the arrival airport
         * @param departureAirport the departure airport
         * @param arrivalTime the arrival time
         * @param departureTime the departure time
         */
        public Builder(String name,String id, Plane plane, Airport arrivalAirport, Airport departureAirport, Date arrivalTime, Date departureTime) {
            this.name = name;
            this.id = id;
            this.plane = plane;
            this.arrivalAirport = arrivalAirport;
            this.departureAirport = departureAirport;
            this.arrivalTime = arrivalTime;
            this.departureTime = departureTime;
            this.plane = plane;
        }

        /**
         * Name builder.
         *
         * @param name the name
         * @return the builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Id builder.
         *
         * @param id the id
         * @return the builder
         */
        public Builder id(String id) {
            this.id = id;
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
