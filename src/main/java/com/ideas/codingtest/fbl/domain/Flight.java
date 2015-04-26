package com.ideas.codingtest.fbl.domain;

import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import org.joda.time.DateTime;

import java.util.LinkedList;
import java.util.List;

/**
 * The type Flight.
 */
public class Flight implements Edge {

    private final List<Booking> bookings = new LinkedList<>();

    private String number;

    private Airline airline;

    private int weight;

    private DateTime departureTime;

    private DateTime arrivalTime;

    private Airport departureAirport;

    private Airport arrivalAirport;

    private Plane plane;


    /**
     * Instantiates a new Flight.
     *
     * @param builder the builder
     */
    private Flight(Builder builder) throws IllegalArgumentException{
        if (builder.number == null || builder.airline == null || builder.departureTime == null
                || builder.arrivalTime == null || builder.departureAirport == null||builder.arrivalAirport == null
                || builder.plane == null || builder.weight <= 0) {
            throw new IllegalArgumentException();
        }
        this.number = builder.number;
        this.airline=builder.airline;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.departureAirport = builder.departureAirport;
        this.arrivalAirport = builder.arrivalAirport;
        this.plane = builder.plane;
        this.weight =builder.weight;
    }


    /**
     * Gets bookings.
     *
     * @return the bookings
     */
    public List<Booking> getBookings() {
        return bookings;
    }

    /**
     * Gets number.
     *
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    public Airline getAirline() {
        return airline;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * Gets departure time.
     *
     * @return the departure time
     */
    public DateTime getDepartureTime() {
        return departureTime;
    }

    /**
     * Gets arrival time.
     *
     * @return the arrival time
     */
    public DateTime getArrivalTime() {
        return arrivalTime;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public String getId() {
        return airline.getId();
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Gets plane.
     *
     * @return the plane
     */
    public Plane getPlane() {
        return plane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Builder builder = (Builder) o;

        if (weight != builder.weight) return false;
        if (!airline.equals(builder.airline)) return false;
        if (!arrivalAirport.equals(builder.arrivalAirport)) return false;
        if (!arrivalTime.equals(builder.arrivalTime)) return false;
        if (!departureAirport.equals(builder.departureAirport)) return false;
        if (!departureTime.equals(builder.departureTime)) return false;
        if (!number.equals(builder.number)) return false;
        if (!plane.equals(builder.plane)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number.hashCode();
        result = 31 * result + airline.hashCode();
        result = 31 * result + weight;
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        result = 31 * result + plane.hashCode();
        return result;
    }


    /**
     * The type Builder.
     */
    public static class Builder {

        private String number;

        private Airline airline;

        private int weight;

        private DateTime departureTime;

        private DateTime arrivalTime;

        private Airport departureAirport;

        private Airport arrivalAirport;

        private Plane plane;


        /**
         * Instantiates a new Builder.
         */
        public Builder() {
        }

        /**
         * Name builder.
         *
         * @param number the number
         * @return the builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }


        public Builder airline(Airline airline) {
            this.airline = airline;
            return this;
        }


        /**
         * Weight builder.
         *
         * @param weight the weight
         * @return the builder
         */
        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Departure time.
         *
         * @param departureTime the departure time
         * @return the builder
         */
        public Builder departureTime(DateTime departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        /**
         * Arrival time.
         *
         * @param arrivalTime the arrival time
         * @return the builder
         */
        public Builder arrivalTime(DateTime arrivalTime) {
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
