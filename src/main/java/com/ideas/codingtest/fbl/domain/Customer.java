package com.ideas.codingtest.fbl.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Customer {

    private String saluation;
    private String surname;
    private String forename;
    private String address;
    private String telNum;
    private final List<Booking> fellowPassengers = new ArrayList<Booking>();

    /**
     * Gets saluation.
     *
     * @return the saluation
     */
    public String getSaluation() {
        return saluation;
    }

    /**
     * Sets saluation.
     *
     * @param saluation the saluation
     */
    public void setSaluation(String saluation) {
        this.saluation = saluation;
    }

    /**
     * Gets surname.
     *
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets surname.
     *
     * @param surname the surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets forename.
     *
     * @return the forename
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets forename.
     *
     * @param forename the forename
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets tel num.
     *
     * @return the tel num
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * Sets tel num.
     *
     * @param telNum the tel num
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     * Gets fellow passengers.
     *
     * @return the fellow passengers
     */
    public List<Booking> getFellowPassengers() {
        return fellowPassengers;
    }
}
