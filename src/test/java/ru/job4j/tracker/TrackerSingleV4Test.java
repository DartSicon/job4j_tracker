package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerSingleV4Test {

    @Test
    public void whenTrackerIsSingleton() {
        TrackerSingleV4 single1 = TrackerSingleV4.getInstance();
        single1.tracker.add(new Item(1, "Test"));
        TrackerSingleV4 single2 = TrackerSingleV4.getInstance();
        assertEquals(single2.tracker.findById(1).getName(), "Test");
    }

}