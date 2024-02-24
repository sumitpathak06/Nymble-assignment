package com.travel.agency.assignment;

import java.util.*;
public class Destination {
    private String name;
    private List<ActivityImp> activities = new ArrayList<>();

    //CONSTRUCTOR FOR DESTINATION CLASS
    public Destination(String name) {
        this.name = name;
    }

    //GETTER FUNCTIONS
    public String getName() {
        return name;
    }

    public List<ActivityImp> getActivities() {
        return activities;
    }

    public void addActivity(ActivityImp activity) {
        activities.add(activity);
    }

}