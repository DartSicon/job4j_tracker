package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerSingleV3Test {

    @Test
    public void whenTrackerIsSingleton() {
        TrackerSingleV3 single1 = TrackerSingleV3.getInstance();
        single1.tracker.add(new Item(1, "Test"));
        TrackerSingleV3 single2 = TrackerSingleV3.getInstance();
        assertEquals(single2.tracker.findById(1).getName(), "Test");
    }

}