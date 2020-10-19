package ru.job4j.tracker;

import ru.job4j.inheritance.TextReport;

public class TrackerSingleV4 {
    private Tracker tracker = new Tracker();

    private TrackerSingleV4() {

    }

    public Tracker getTracker() {
        return this.tracker;
    }

    public static TrackerSingleV4 getInstance() {
        return Holder.INSTANCE;
    }


    private static final class Holder {
        private static final TrackerSingleV4 INSTANCE = new TrackerSingleV4();
    }
}
