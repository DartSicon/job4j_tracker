package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerSingleV2Test {

    @Test
    public void whenTrackerIsSingleton() {
        TrackerSingleV2 single1 = TrackerSingleV2.getInstance();
        single1.getTracker().add(new Item(1, "Test"));
        TrackerSingleV2 single2 = TrackerSingleV2.getInstance();
        assertEquals(single2.getTracker().findById(1).getName(), "Test");
    }

}