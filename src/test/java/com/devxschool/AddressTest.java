package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    private static final String test1FullAddress = "2400 E Devon Ave #215, Des Plaines, IL 60018";
    private static final String test2FullAddress = "1 N Main St, A, MA 034566";

    @Test
    public void test1GetStreetAddress() {
        assertEquals("Should be a street address", "2400 E Devon Ave #215", Address.getStreetAddress(test1FullAddress));
    }

    @Test
    public void test2GetStreetAddress() {
        assertEquals("Should be a street address", "1 N Main St", Address.getStreetAddress(test2FullAddress));
    }

    @Test
    public void test1GetCity() {
        assertEquals("Should get a city name", "Des Plaines", Address.getCity(test1FullAddress));
    }

    @Test
    public void test2GetCity() {
        assertEquals("Should get a city name", "A", Address.getCity(test2FullAddress));
    }

    @Test
    public void test1GetState() {
        assertEquals("Should get a state name", "IL", Address.getState(test1FullAddress));
    }

    @Test
    public void test2GetState() {
        assertEquals("Should get a state name", "MA", Address.getState(test2FullAddress));
    }

    @Test
    public void test1GetZipcode() {
        assertEquals("Should get a zip code", 60018, Address.getZipcode(test1FullAddress));
    }

    @Test
    public void test2GetZipcode() {
        assertEquals("Should get a zip code", 34566, Address.getZipcode(test2FullAddress));
    }
}
