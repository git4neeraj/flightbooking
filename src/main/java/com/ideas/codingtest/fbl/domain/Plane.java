package com.ideas.codingtest.fbl.domain;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Plane {

    private String model;

    private int capacity;

    private String flightNumber;

    /**
     * Instantiates a new Plane.
     *
     * @param model the model
     * @param capacity the capacity
     */
    public Plane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    /**
     * Gets flight number.
     *
     * @return the flight number
     */
    public String getFlightNumber() {

        return flightNumber;
    }

    /**
     * Sets flight number.
     *
     * @param flightNumber the flight number
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (capacity != plane.capacity) return false;
        if (!flightNumber.equals(plane.flightNumber)) return false;
        if (!model.equals(plane.model)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + capacity;
        result = 31 * result + flightNumber.hashCode();
        return result;
    }

}
