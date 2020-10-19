package ru.job4j.tracker;

public class TrackerSingleV3 {
    private static final TrackerSingleV3 INSTANCE = new TrackerSingleV3();
    private Tracker tracker = new Tracker();

    private TrackerSingleV3() {

    }

    public Tracker getTracker() {
        return this.tracker;
    }

    public static TrackerSingleV3 getInstance() {
        return INSTANCE;
    }
}
