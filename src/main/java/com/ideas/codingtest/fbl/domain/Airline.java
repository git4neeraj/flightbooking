package com.ideas.codingtest.fbl.domain;

/**
 * Created by Neeraj on 4/27/2015.
 */
public enum Airline {
    INDIGO("INDG001"),GOAIR("GOAI002"),AIRINDIA("AIRI003"),JETAIRWAYS("JETA004");

    private final String id ;

    Airline(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
