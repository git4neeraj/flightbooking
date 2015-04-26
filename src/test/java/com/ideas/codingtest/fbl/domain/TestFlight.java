package com.ideas.codingtest.fbl.domain;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Neeraj on 4/13/2015.
 */
public class TestFlight {

    private static Airport departureAirport;
    private static Airport arrivalAirport;
    private static Airline airline;
    /**
     * Pre set up.
     */
    @BeforeClass
    public static void preSetUp(){
         departureAirport =new Airport("NDL",City.NEWDELHI.toString(),Country.INDIA);
         arrivalAirport =new Airport("INR",City.INDORE.toString(),Country.INDIA);
         airline=Airline.INDIGO;
    }


    /**
     * Post set up per test.
     */
    @Before
    public void postSetUpPerTest(){

    }

    @Test
    public void testFlightCreation(){

        Flight flight =new Flight.Builder()
                .departureAirport(departureAirport)
                .departureTime(DateTime.now().plusDays(1))
                .arrivalAirport(arrivalAirport)
                .arrivalTime(new DateTime().plusDays(1).plusHours(2))
                .number("001")
                .airline(airline)
                .weight(2)
                .plane(new Plane("BOEING727", 100))
                .build();
        assertNotNull(flight);
        assertEquals(departureAirport,flight.getDepartureAirport());
        assertEquals(2,flight.getWeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFlightCreationIllegalArgumentException(){
        Flight flight =new Flight.Builder()
                .departureAirport(departureAirport)
                .departureTime(DateTime.now().plusDays(1))
                .arrivalAirport(null)//null airport
                .arrivalTime(new DateTime().plusDays(1).plusHours(2))
                .number("001")
                .airline(airline)
                .weight(2)
                .plane(new Plane("BOEING727", 100))
                .build();
    }


}
