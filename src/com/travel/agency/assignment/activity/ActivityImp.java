package com.travel.agency.assignment.activity;

public class ActivityImp {
    private String name;
    private String description;
    private double cost;
    private int capacity;

    public ActivityImp(String name, String description, double cost, int capacity){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }

    //GETTER AND SETTER FOR ACTIVITY NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //GETTER AND SETTER FOR ACTIVITY DESCRIPTION
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //GETTER AND SETTER FOR ACTIVITY COST
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    GETTER AND SETTER FOR ACTIVITY CAPACITY
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
