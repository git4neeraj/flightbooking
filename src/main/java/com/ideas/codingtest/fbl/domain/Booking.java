package com.ideas.codingtest.fbl.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Booking {
    private Integer bookingRefNumber;
    private final Date date = new Date();
    private Customer customer;
    private List<Passenger> passengers = new ArrayList<Passenger>();
}
