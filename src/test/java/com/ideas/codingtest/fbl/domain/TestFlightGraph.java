package com.ideas.codingtest.fbl.domain;

import com.ideas.codingtest.fbl.domain.dijkstra.Edge;
import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by Neeraj on 4/27/2015.
 */
public class TestFlightGraph {

    private static List<Vertex> airports;
    private static List<Edge> flights;

    /**
     *  Pre set up.
     */
    @BeforeClass
    public static void preSetUp(){
        airports =new ArrayList<>();
        flights =new ArrayList<>();
        Airport newDelhi=new Airport("NDL",City.NEWDELHI.toString(), Country.INDIA);
        Airport indore=new Airport("INR",City.INDORE.toString(), Country.INDIA);
        Airport ahemdabad=new Airport("AHM",City.AHMEDABAD.toString(),Country.INDIA);
        Airport mumbai=new Airport("BOM",City.MUMBAI.toString(),Country.INDIA);
        Airport goa=new Airport("GOA",City.GOA.toString(),Country.INDIA);
        Airport kolkota=new Airport("KOL",City.KOLKOTA.toString(),Country.INDIA);
        Airport banglore=new Airport("BGL",City.BANGLORE.toString(),Country.INDIA);
        Airport chennai=new Airport("CHN",City.CHENNAI.toString(),Country.INDIA);
        Airport katmandu=new Airport("KAT",City.KATHMANDU.toString(),Country.NEPAL);
        Airport dhaka=new Airport("DHK",City.DHAKA.toString(),Country.BANGLADESH);
        Airport colombo=new Airport("COL",City.COLOMBO.toString(),Country.SHREELANKA);

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
                .airline(Airline.AIRINDIA)
                .weight(2)
                .plane(new Plane("BOEING727", 100))
                .build());

        flights.add(new Flight.Builder()
                .departureAirport(indore)
                .departureTime(DateTime.now().plusDays(1).plusHours(3))
                .arrivalAirport(ahemdabad)
                .arrivalTime(new DateTime().plusDays(1).plusHours(5))
                .number("002")
                .airline(Airline.AIRINDIA)
                .weight(2)
                .plane(new Plane("BOEING727",100))
                .build());

        flights.add(new Flight.Builder()
                .departureAirport(ahemdabad)
                .departureTime(DateTime.now().plusDays(1).plusHours(6))
                .arrivalAirport(mumbai)
                .arrivalTime(new DateTime().plusDays(1).plusHours(8))
                .number("003")
                .airline(Airline.AIRINDIA)
                .weight(5)
                .plane(new Plane("BOEING727",100))
                .build());
        flights.add(new Flight.Builder()
                .departureAirport(mumbai)
                .departureTime(DateTime.now().plusDays(1).plusHours(9))
                .arrivalAirport(goa)
                .arrivalTime(new DateTime().plusDays(1).plusHours(10))
                .number("004")
                .airline(Airline.AIRINDIA)
                .weight(5)
                .plane(new Plane("BOEING727",100))
                .build());
        flights.add(new Flight.Builder()
                .departureAirport(indore)
                .departureTime(DateTime.now().plusDays(1).plusHours(6))
                .arrivalAirport(banglore)
                .arrivalTime(new DateTime().plusDays(1).plusHours(9))
                .number("005")
                .airline(Airline.AIRINDIA)
                .weight(3)
                .plane(new Plane("BOEING727",100))
                .build());
        flights.add(new Flight.Builder()
                .departureAirport(banglore)
                .departureTime(DateTime.now().plusDays(1).plusHours(10))
                .arrivalAirport(colombo)
                .arrivalTime(new DateTime().plusDays(1).plusHours(12))
                .number("005")
                .airline(Airline.AIRINDIA)
                .weight(3)
                .plane(new Plane("BOEING727",100))
                .build());

        flights.add(new Flight.Builder()
                .departureAirport(newDelhi)
                .departureTime(DateTime.now().plusDays(1).plusHours(10))
                .arrivalAirport(katmandu)
                .arrivalTime(new DateTime().plusDays(1).plusHours(12))
                .number("005")
                .airline(Airline.AIRINDIA)
                .weight(3)
                .plane(new Plane("BOEING727",100))
                .build());
    }


    /**
     * Post set up per test.
     */
    @Before
    public void postSetUpPerTest(){

    }

    /**
     * Test flight graph creation.
     */
    @Test
    public void testFlightGraphCreation() {
        FlightsGraph   flightsGraph = new FlightsGraph(airports,flights);
        assertNotNull(flightsGraph);
        assertNotNull(flightsGraph.getAirports());
        assertNotNull(flightsGraph.getFlights());
    }

    @Test(expected = IllegalArgumentException.class )
    public void testEmptyAirportsAndFlightsFlightGraphCreation() {
        FlightsGraph   flightsGraph = new FlightsGraph(new ArrayList<Vertex>(),new ArrayList<Edge>());
    }

    @Test(expected = IllegalArgumentException.class )
    public void testNullAirportsOnFlighGraphCreationIllegalArgumentException() throws IllegalArgumentException {
        FlightsGraph   flightsGraph3 = new FlightsGraph(null,flights);
    }

    @Test(expected = IllegalArgumentException.class )
    public void testNullFlightsOnFlighGraphCreationIllegalArgumentException() throws IllegalArgumentException {
        FlightsGraph   flightsGraph3 = new FlightsGraph(airports,null);
    }

    @Test(expected = IllegalArgumentException.class )
    public void testNullAirportsAndFlightsOnFlighGraphCreationIllegalArgumentException() throws IllegalArgumentException {
        FlightsGraph   flightsGraph3 = new FlightsGraph(airports,null);
    }
}
