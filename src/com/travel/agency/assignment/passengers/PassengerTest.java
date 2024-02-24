package com.travel.agency.assignment;

import com.travel.agency.asssignment.acticity.ActivityImp;
import com.travel.agencies.task.destination.Destination;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PassengerTest {
    @Test
    void testSignUpForActivity() {
        ActivityImp snorkeling = new ActivityImp("Snorkeling", "Explore underwater life", 50, 10);
        Destination beach = new Destination("Beach Paradise");
        beach.addActivity(snorkeling);

        Passenger alice = new Passenger("Jay", 101, 100, PassengerTypeEnum.STANDARD);

        // Test passenger sign up for activity
        boolean signUpResult = alice.signUpForActivity(snorkeling);

        assertTrue(signUpResult);
        assertEquals(1, alice.getActivitiesEnrolled().size());
        assertEquals(50, alice.getBalance());
    }

    @Test
    void testSignUpForActivityInsufficientFunds() {
        ActivityImp Wallyball = new ActivityImp("Wallyball", "Kings always wins", 50, 10);
        Destination beach = new Destination("Beach Paradise");
        beach.addActivity(Wallyball);

        Passenger alice = new Passenger("Parth", 101, 30, PassengerTypeEnum.STANDARD);

        // Test passenger sign up for activity with insufficient funds
        boolean signUpResult = alice.signUpForActivity(Wallyball);

        assertFalse(signUpResult);
        assertEquals(0, alice.getActivitiesEnrolled().size());
        assertEquals(30, alice.getBalance());
    }

    @Test
    void testSignUpForActivityFullCapacity() {
        ActivityImp snorkeling = new ActivityImp("Table tennis", "Better togather", 50, 0);
        Destination beach = new Destination("Beach Paradise");
        beach.addActivity(snorkeling);

        Passenger alice = new Passenger("Parth", 101, 100, PassengerTypeEnum.STANDARD);

        // Test passenger sign up for activity with full capacity
        boolean signUpResult = alice.signUpForActivity(snorkeling);

        assertFalse(signUpResult);
        assertEquals(0, alice.getActivitiesEnrolled().size());
        assertEquals(100, alice.getBalance());
    }

    @Test
    void testGoldPassengerSignUpWithDiscount() {
        ActivityImp snorkeling = new ActivityImp("Snorkeling", "Explore underwater life", 50, 10);
        Destination beach = new Destination("Beach Paradise");
        beach.addActivity(snorkeling);

        Passenger bob = new Passenger("Meet", 102, 100, PassengerTypeEnum.GOLD);

        // Test gold passenger sign up for activity with discount
        boolean signUpResult = bob.signUpForActivity(snorkeling);

        assertTrue(signUpResult);
        assertEquals(1, bob.getActivitiesEnrolled().size());
        assertEquals(95, bob.getBalance());
    }
}
