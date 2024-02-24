package com.travel.agency.assignment.passenger;

public class GoldPassengerType  {
    public static boolean canSignUpForActivity(double balance, double cost) {
        return balance >= cost * 0.9;
    }


    public static double calculateCost(double originalCost) {
        return originalCost * 0.9;
    }
}
