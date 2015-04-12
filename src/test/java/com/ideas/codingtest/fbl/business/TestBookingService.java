package com.ideas.codingtest.fbl.business;

import com.ideas.codingtest.fbl.domain.*;
import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class TestBookingService {

   private static BookingService bookingService;

    @BeforeClass
    public static void preSetUp(){
        List<Vertex> airports =new ArrayList<>();
        List<Edge> flights =new ArrayList<>();
        init(airports,flights);
        FlightsGraph flightsGraph = new FlightsGraph(airports,flights);
        bookingService=new BookingService(flightsGraph);
    }



    @Before
    public void postSetUpPerTest(){

    }

    @Test
    public void testBookFlight(){
        bookingService.bookFlight(new Booking());
    }

    @After
    public void tearDown(){
    }


    private static void init(List<Vertex> airports, List<Edge> flights) {
        Airport newDelhi=new Airport("NDL","NEW DELHI", Country.INDIA);
        Airport indore=new Airport("INR","INDORE", Country.INDIA);
        Airport ahemdabad=new Airport("AHM","AHMEDABAD",Country.INDIA);
        Airport mumbai=new Airport("BOM","MUMBAI",Country.INDIA);
        Airport goa=new Airport("GOA","GOA",Country.INDIA);
        Airport kolkota=new Airport("KOL","KOLKOTA",Country.INDIA);
        Airport banglore=new Airport("BGL","BANGLORE",Country.INDIA);
        Airport chennai=new Airport("CHN","CHENNAI",Country.INDIA);
        Airport katmandu=new Airport("KAT","KATMANDU",Country.NEPAL);
        Airport dhaka=new Airport("DHK","DHAKA",Country.BANGLADESH);
        Airport colombo=new Airport("COL","COLOMBO",Country.SHREELANKA);
        //
        airports.add(newDelhi);
        airports.add(indore);
        airports.add(ahemdabad);
        airports.add(mumbai);
        airports.add(goa);
        airports.add(kolkota);
        airports.add(banglore);
        airports.add(chennai);
        airports.add(katmandu);
        airports.add(dhaka);
        airports.add(colombo);
        //flights
        flights.add(new Flight.Builder()
                .departureAirport(newDelhi)
                .departureTime(DateTime.now().plusDays(1))
                .arrivalAirport(indore)
                .arrivalTime(new DateTime().plusDays(1).plusHours(2))
                .number("001")
                .id("AIRLINEONE")
                .weight(2)
                .plane(new Plane("BOEING727",100))
                .build());

        flights.add(new Flight.Builder()
                .departureAirport(indore)
                .departureTime(DateTime.now().plusDays(1).plusHours(3))
                .arrivalAirport(ahemdabad)
                .arrivalTime(new DateTime().plusDays(1).plusHours(5))
                .number("002")
                .id("AIRLINEONE")
                .weight(2)
                .plane(new Plane("BOEING727",100))
                .build());

        flights.add(new Flight.Builder()
                .departureAirport(ahemdabad)
                .departureTime(DateTime.now().plusDays(1).plusHours(6))
                .arrivalAirport(mumbai)
                .arrivalTime(new DateTime().plusDays(1).plusHours(8))
                .number("003")
                .id("AIRLINEONE")
                .weight(5)
                .plane(new Plane("BOEING727",100))
                .build());
        flights.add(new Flight.Builder()
                .departureAirport(mumbai)
                .departureTime(DateTime.now().plusDays(1).plusHours(9))
                .arrivalAirport(goa)
                .arrivalTime(new DateTime().plusDays(1).plusHours(10))
                .number("004")
                .id("AIRLINEONE")
                .weight(5)
                .plane(new Plane("BOEING727",100))
                .build());
        flights.add(new Flight.Builder()
                .departureAirport(indore)
                .departureTime(DateTime.now().plusDays(1).plusHours(6))
                .arrivalAirport(banglore)
                .arrivalTime(new DateTime().plusDays(1).plusHours(9))
                .number("005")
                .id("AIRLINEONE")
                .weight(3)
                .plane(new Plane("BOEING727",100))
                .build());
    }
}
