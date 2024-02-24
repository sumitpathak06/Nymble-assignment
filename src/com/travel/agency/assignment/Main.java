package com.travel.agency.assignment;

import com.travel.agency.assignment.activity.*;
import com.travel.agency.assignment.destination.Destination;
import com.travel.agency.assignment.passenger.*;

import java.util.*;

class Main
{
    public static void main(String[] args) {

        //TWO DESTINATIONS -> BEACH AND MOUNTAINS
        Destination beach = new Destination("Beach Paradise");
        Destination mountain = new Destination("Mountain Retreat");

        //INITIALISING ACTIVITIES
        ActivityImp snorkeling = new ActivityImp("Snorkeling", "Explore underwater life", 50, 10);
        ActivityImp sunbathing = new ActivityImp("Table tennise", "Relax on the beach", 20, 20);
        ActivityImp hiking = new ActivityImp("Wallyball", "Kings always wins", 30, 15);

        //ADDING ACTIVITY TO RESPECTIVE DESTINATIONS
        beach.addActivity(snorkeling);
        beach.addActivity(sunbathing);
        mountain.addActivity(hiking);

        //TRAVELPACKAER SUMMERGATEWAY
        TravelPackage summerGetaway = new TravelPackage("Summer Getaway", 3);
        summerGetaway.addDestination(beach);
        summerGetaway.addDestination(mountain);

        //INITIALISING THREE PASSENGERS -> ALICE, BOB, CHARLIE
        Passenger alice = new Passenger("Jay", 101, 100, PassengerTypeEnum.STANDARD);
        Passenger bob = new Passenger("Parth", 102, 200, PassengerTypeEnum.GOLD);
        Passenger charlie = new Passenger("Meet", 103, 0, PassengerTypeEnum.PREMIUM);

        //ADDING PASSENGERS TO THE SUMMERGATEWAY TRAVELPACKAGE
        summerGetaway.addPassenger(alice);
        summerGetaway.addPassenger(bob);
        summerGetaway.addPassenger(charlie);

        //SIGNING UP PASSENGERS FOR THE ACTIVITY
        alice.signUpForActivity(snorkeling);
        alice.signUpForActivity(hiking);
        bob.signUpForActivity(sunbathing);
        charlie.signUpForActivity(snorkeling);

        //PRINT ITINERARY AND LIST OF PASSENGERS
        summerGetaway.printItinerary();
        summerGetaway.printPassengerList();
    }
}