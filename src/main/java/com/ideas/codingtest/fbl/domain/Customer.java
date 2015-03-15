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
}
