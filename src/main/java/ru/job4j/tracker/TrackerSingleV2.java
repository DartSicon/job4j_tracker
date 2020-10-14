package ru.job4j.tracker;

public class TrackerSingleV2 {
    private static TrackerSingleV2 instance;
    public Tracker tracker = new Tracker();

    private TrackerSingleV2() {

    }

    public static TrackerSingleV2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingleV2();
        }
        return instance;
    }


}
