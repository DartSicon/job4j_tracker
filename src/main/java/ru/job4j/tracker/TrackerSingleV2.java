package ru.job4j.tracker;

public class TrackerSingleV2 {
    private static TrackerSingleV2 instance;
    private Tracker tracker = new Tracker();

    private TrackerSingleV2() {

    }

    public Tracker getTracker() {
        return this.tracker;
    }

    public static TrackerSingleV2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingleV2();
        }
        return instance;
    }

}
