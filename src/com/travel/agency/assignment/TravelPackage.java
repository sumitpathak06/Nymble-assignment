package com.travel.agency.assignment;

import com.travel.agency.assignment.activity.ActivityImp;
import com.travel.agency.assignment.passenger.Passenger;
import com.travel.agency.assignment.destination.Destination;

import java.uti.*;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary = new ArrayList<>();
    private List<Passenger> passengersEnrolled = new ArrayList<>();


    //GETTER FUNCTIONS
    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public List<Passenger> getPassengersEnrolled() {
        return passengersEnrolled;
    }


    //CONSTRUCTOR FOR TRAVELPACKAGE CLASS
    public TravelPackage(String name, int passengerCapacity){
        this.name=name;
        this.passengerCapacity = passengerCapacity;
    }

    //ADD DESTINATION
    public void addDestination(Destination destination){
        itinerary.add(destination);
    }

    //ADD PASSENGERS, IF CAPACITY NOT EXCEEDED
    public void addPassengers(Passenger passenger){
        if(passengersEnrolled.size() < passengerCapacity){
            passengersEnrolled.add(passenger);
        }
    }

    //PRINT THE ITINERARY
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (ActivityImp activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() +
                        ", Description: " + activity.getDescription() +
                        ", Cost: " + activity.getCost() +
                        ", Capacity: " + activity.getCapacity());
            }
        }
    }

    //PRINT THE LIST OF PASSENGER
    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengersEnrolled.size());
        for (Passenger passenger : passengersEnrolled) {
            System.out.println("Passenger Name: " + passenger.getName() +
                    ", Number: " + passenger.getPassengerNumber());
        }
    }
}