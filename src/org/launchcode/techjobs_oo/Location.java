package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{
    public int id;
    private static int nextId = 1;
    private String value;

    public Location() {
        id = nextId;
        nextId++;
    }

    public Location(String value) {
        super(value);
    }
    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

}