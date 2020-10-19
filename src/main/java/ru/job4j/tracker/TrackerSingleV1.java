package ru.job4j.tracker;

public enum TrackerSingleV1 {
    INSTANCE;

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return this.tracker;
    }
}
