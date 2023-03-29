package com.devxschool;

import java.util.Scanner;
public class Address {

    public static void main(String[] args) {

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */

//        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        //TODO WRITE YOUR CODE HERE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.println("Street Address: " + getStreetAddress(address));
        System.out.println("City: " + getCity(address));
        System.out.println("State: " + getState(address));
        System.out.println("Zipcode: " + getZipcode(address));
    }


    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {
        String[] parts = address.split(",");
        return parts[0];
    }

    public static String getCity(String address) {
        String[] parts = address.split(",");
        return parts[1].trim();
    }

    public static String getState(String address) {
        String[] parts = address.split(",");
        String stateZip = parts[2].trim();
        String[] stateZipParts = stateZip.split(" ");
        return stateZipParts[0];
    }

    public static int getZipcode(String address) {
        String[] parts = address.split(",");
        String stateZip = parts[2].trim();
        String[] stateZipParts = stateZip.split(" ");
        return Integer.parseInt(stateZipParts[1]);
    }
}
