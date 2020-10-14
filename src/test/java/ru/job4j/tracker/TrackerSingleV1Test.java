package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerSingleV1Test {

    @Test
    public void whenTrackerIsSingleton() {
        TrackerSingleV1 single1 = TrackerSingleV1.INSTANCE;
        single1.tracker.add(new Item(1, "Test"));
        TrackerSingleV1 single2 = TrackerSingleV1.INSTANCE;
        assertEquals(single2.tracker.findById(1).getName(), "Test");
    }

}