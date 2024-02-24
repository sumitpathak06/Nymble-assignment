package com.travel.agency.assignment;

import com.travel.agency.assignment.activity.ActivityImp;
import com.travel.agency.assignment.destination.Destination;
import com.travel.agency.assignment.passenger.Passenger;
import com.travel.agency.assignment.passenger.PassengerTypeEnum;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TravelPackageTest {
    @Test
    void testAddPassenger() {
        TravelPackage summerGetaway = new TravelPackage("Summer Getaway", 3);
        Passenger alice = new Passenger("Jay", 101, 100, PassengerTypeEnum.STANDARD);
        Passenger bob = new Passenger("Parth", 102, 200, PassengerTypeEnum.GOLD);

        // Test adding passengers to the travel package
        summerGetaway.addPassenger(alice);
        summerGetaway.addPassenger(bob);

        assertEquals(2, summerGetaway.getPassengersEnrolled().size());
    }

    @Test
    void testAddDestination() {
        TravelPackage summerGetaway = new TravelPackage("Summer Getaway", 3);
        Destination beach = new Destination("Beach Paradise");
        Destination mountain = new Destination("Mountain Retreat");

        // Test adding destinations to the travel package
        summerGetaway.addDestination(beach);
        summerGetaway.addDestination(mountain);

        assertEquals(2, summerGetaway.getItinerary().size());
    }



    @Test
    void testGoldPassengerSignUpWithInsufficientFunds() {
        ActivityImp snorkeling = new ActivityImp("Snorkeling", "Explore underwater life", 50, 10);
        Destination beach = new Destination("Beach Paradise");
        beach.addActivity(snorkeling);

        TravelPackage summerGetaway = new TravelPackage("Summer Getaway", 3);
        summerGetaway.addDestination(beach);

        Passenger bob = new Passenger("Keval", 102, 30, PassengerTypeEnum.GOLD);

        // Test gold passenger sign up with insufficient funds
        boolean signUpResult = bob.signUpForActivity(snorkeling);

        assertFalse(signUpResult);
        assertEquals(0, bob.getActivitiesEnrolled().size());
        assertEquals(30, bob.getBalance());
    }

}
