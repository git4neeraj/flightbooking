package com.ideas.codingtest.fbl.domain;

import com.ideas.codingtest.fbl.domain.dijkstra.Vertex;

/**
 * Created by Neeraj on 3/16/2015.
 */
public class Airport implements Vertex {

    private final String id;

    private final String name;

    private final Country country;

    /**
     * Instantiates a new Airport.
     *
     * @param id the id
     * @param name the name
     * @param country the country
     */
    public Airport(String id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Get country.
     *
     * @return the string
     */
    public Country getCountry(){return  this.country; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (country != airport.country) return false;
        if (!id.equals(airport.id)) return false;
        if (!name.equals(airport.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
