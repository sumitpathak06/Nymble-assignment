package com.travel.agency.assignment.activity;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ActivityTest {
    @Test
    void testGetName() {
        ActivityImp activity = new ActivityImp("Jay", "Explore the mountains", 20.0, 10);
        assertEquals("Hiking", activity.getName());
    }

    @Test
    void testGetDescription() {
        ActivityImp activity = new ActivityImp("Jay", "Explore the mountains", 20.0, 10);
        assertEquals("Explore the mountains", activity.getDescription());
    }

    @Test
    void testGetCost() {
        ActivityImp activity = new ActivityImp("Jay", "Explore the mountains", 20.0, 10);
        assertEquals(20.0, activity.getCost(), 0.001);
    }

    @Test
    void testGetCapacity() {
        ActivityImp activity = new ActivityImp("Jay", "Explore the mountains", 20.0, 10);
        assertEquals(10, activity.getCapacity());
    }

    @Test
    void testCapacityDecrease() {
        ActivityImp activity = new ActivityImp("Jay", "Explore the mountains", 20.0, 10);
        assertEquals(10, activity.getCapacity());


        assertEquals(9, activity.getCapacity());
    }

}
