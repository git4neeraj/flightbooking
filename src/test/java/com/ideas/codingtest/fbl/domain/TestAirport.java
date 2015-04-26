package com.ideas.codingtest.fbl.domain;

import com.ideas.codingtest.fbl.business.BookingService;
import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class TestAirport {



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
    public void testAirportCreation(){
        Airport airport =new Airport("NDL",City.NEWDELHI.toString(),Country.INDIA);
        assertNotNull(airport);
        assertEquals(City.NEWDELHI.toString(),airport.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAirportCreationIllegalArgumentException(){
        Airport airport =new Airport(null,City.NEWDELHI.toString(),Country.INDIA);
    }
}
