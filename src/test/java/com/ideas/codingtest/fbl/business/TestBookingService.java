package com.ideas.codingtest.fbl.business;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class TestBookingService {

   private BookingService bookingService;
    @BeforeClass
    private void preSetUp(){
        bookingService=new BookingService();
    }

    @Before
    private void postSetUpPerTest(){

    }

    @Test
    public void testBookFlight(){
        bookingService.bookFlight();
    }

    @After
    private void tearDown(){
    }
}
