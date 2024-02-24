package com.travel.agency.assignment;
import com.travel.agency.asssignment.activity.ActivityImp;

import java.util.*;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private PassengerTypeEnum passengerType;
    private List<ActivityImp> activitiesEnrolled = new ArrayList<>();


    //CONSTRUCTOR FOR PASSENGER CLASS
    public Passenger(String name, int passengerNumber, double balance, PassengerTypeEnum passengerType) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.passengerType = passengerType;
    }

    //GETTER FUNCTIONS
    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public PassengerTypeEnum getPassengerType() {
        return passengerType;
    }

    public List<ActivityImp> getActivitiesEnrolled() {
        return activitiesEnrolled;
    }

    //SIGNING UP FOR THE EVENT, ONLY IF THE CAPACITY IS NOT COME DOWN TO 0
    public boolean signUpForActivity(ActivityImp activity)
    {
        if(activity.getCapacity() > 0){
            //STANDARD PASSENGER TYPE CHARGES -> FULL COST DEDUCTED
            if (passengerType.equals(PassengerTypeEnum.STANDARD)) {
                if (StandardPassengerType.canSignUpForActivity(balance, activity.getCost())) {
                    activitiesEnrolled.add(activity);
                    balance -= activity.getCost();
                    activity.setCapacity(activity.getCapacity() - 1);
                    return true;
                }
            }
            //GOLD PASSENGER TYPE CHARGES -> 10% DISCOUNT
            else if (passengerType.equals(PassengerTypeEnum.GOLD)) {
                if (GoldPassengerType.canSignUpForActivity(balance, activity.getCost())) {
                    activitiesEnrolled.add(activity);
                    balance -= GoldPassengerType.calculateCost(activity.getCost());
                    activity.setCapacity(activity.getCapacity() - 1);
                    return true;
                }
            }
            //PREMIUM PASSENNGER TYPE -> NO CHARGES FOR ACTIVITY
            else if (passengerType.equals(PassengerTypeEnum.PREMIUM)) {
                activitiesEnrolled.add(activity);
                activity.setCapacity(activity.getCapacity() - 1);
                return true;
            }
        }
        return false;
    }
}