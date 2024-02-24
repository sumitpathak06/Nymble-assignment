package com.travel.agency.assignment.passenger;

public interface PassengerType {
    boolean canSignUpForActivity(double balance, double cost);
    double calculateCost(double originalCost);
}