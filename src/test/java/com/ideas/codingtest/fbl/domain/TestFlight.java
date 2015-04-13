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

    /**
     * Pre set up.
     */
    @BeforeClass
    public static void preSetUp(){
    }


    /**
     * Post set up per test.
     */
    @Before
    public void postSetUpPerTest(){

    }

    @Test
    public void testFlightCreation(){
        Airport newDelhi =new Airport("NDL",City.NEWDELHI.toString(),Country.INDIA);
        Airport indore =new Airport("INR",City.INDORE.toString(),Country.INDIA);
        Flight flight =new Flight.Builder()
                .departureAirport(newDelhi)
                .departureTime(DateTime.now().plusDays(1))
                .arrivalAirport(indore)
                .arrivalTime(new DateTime().plusDays(1).plusHours(2))
                .number("001")
                .id("AIRLINEONE")
                .weight(2)
                .plane(new Plane("BOEING727", 100))
                .build();
        assertNotNull(flight);
        assertEquals(newDelhi,flight.getDepartureAirport());
        assertEquals(2,flight.getWeight());
    }
}
