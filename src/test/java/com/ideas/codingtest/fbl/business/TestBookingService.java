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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class TestBookingService {

   private static BookingService bookingService;

    private static FlightsGraph flightsGraph;

    private static Customer customer;

    private static List<Passenger> passengers ;

    /**
     * Pre set up.
     */
    @BeforeClass
    public static void preSetUp(){
        List<Vertex> airports =new ArrayList<>();
        List<Edge> flights =new ArrayList<>();
        init(airports,flights);
        flightsGraph = new FlightsGraph(airports,flights);
        bookingService=new BookingService(flightsGraph);


    }


    /**
     * Post set up per test.
     */
    @Before
    public void postSetUpPerTest(){
        customer=new Customer();
        customer.setForename("TEST1");
        customer.setSurname("USER");
        customer.setSaluation("MR");
        customer.setTelNum("98888999");
        //passenger1
        Passenger passenger1 =new Passenger();
        passenger1.setFirstName("Passenger 1");
        passenger1.setAge(24);

        //passenger2
        Passenger passenger2 =new Passenger();
        passenger2.setFirstName("Passenger 2");
        passenger2.setAge(12);
        //passengers
        passengers=new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
    }

    /**
     * Test book flight.
     */
    @Test
    public void testBookFlight(){
        Airport newDelhi=new Airport("NDL",City.NEWDELHI.toString(), Country.INDIA);
        Airport colombo=new Airport("COL",City.COLOMBO.toString(),Country.SHREELANKA);
        Airport katmandu=new Airport("KAT",City.KATHMANDU.toString(),Country.NEPAL);

        List<Vertex> flights1 =bookingService.bookFlight(new Booking(customer,passengers, newDelhi, colombo));
        assertEquals(newDelhi,flights1.get(0));
        assertEquals(colombo,flights1.get(flights1.size() - 1));
        assertEquals(4,flights1.size());

        List<Vertex> flights2 =bookingService.bookFlight(new Booking(customer,passengers, newDelhi, katmandu));
        assertEquals(newDelhi,flights2.get(0));
        assertEquals(katmandu,flights2.get(flights2.size() - 1));
        assertEquals(2,flights2.size());
        Airport [] expectedAirports={newDelhi,katmandu};
        assertArrayEquals(expectedAirports,flights2.toArray());
    }

    /**
     * Tear down.
     */
    @After
    public void tearDown(){
        bookingService=null;
        flightsGraph=null;
    }


    private static void init(List<Vertex> airports, List<Edge> flights) {
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
                .plane(new Plane("BOEING727", 100))
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
        flights.add(new Flight.Builder()
                .departureAirport(banglore)
                .departureTime(DateTime.now().plusDays(1).plusHours(10))
                .arrivalAirport(colombo)
                .arrivalTime(new DateTime().plusDays(1).plusHours(12))
                .number("005")
                .id("AIRLINEONE")
                .weight(3)
                .plane(new Plane("BOEING727",100))
                .build());

        flights.add(new Flight.Builder()
                .departureAirport(newDelhi)
                .departureTime(DateTime.now().plusDays(1).plusHours(10))
                .arrivalAirport(katmandu)
                .arrivalTime(new DateTime().plusDays(1).plusHours(12))
                .number("005")
                .id("AIRLINEONE")
                .weight(3)
                .plane(new Plane("BOEING727",100))
                .build());
    }
}
