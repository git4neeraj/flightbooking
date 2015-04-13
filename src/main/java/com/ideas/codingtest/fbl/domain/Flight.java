package com.ideas.codingtest.fbl.domain;

import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;
import org.joda.time.DateTime;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * The type Flight.
 */
public class Flight implements Edge {

    private final List<Booking> bookings = new LinkedList<>();

    private String number;

    private String id;

    private int wieght;

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
    public Flight(Builder builder) {
        this.number = builder.number;
        this.id=builder.id;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.departureAirport = builder.departureAirport;
        this.arrivalAirport = builder.arrivalAirport;
        this.plane = builder.plane;
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

    public String getId() {
        return id;
    }

    public int getWeight() {
        return wieght;
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

    /**
     * The type Builder.
     */
    public static class Builder {

        private String number;

        private String id;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (wieght != flight.wieght) return false;
        if (!arrivalAirport.equals(flight.arrivalAirport)) return false;
        if (!arrivalTime.equals(flight.arrivalTime)) return false;
        if (!bookings.equals(flight.bookings)) return false;
        if (!departureAirport.equals(flight.departureAirport)) return false;
        if (!departureTime.equals(flight.departureTime)) return false;
        if (!id.equals(flight.id)) return false;
        if (!number.equals(flight.number)) return false;
        if (!plane.equals(flight.plane)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookings.hashCode();
        result = 31 * result + number.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + wieght;
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        result = 31 * result + plane.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number='" + number + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
