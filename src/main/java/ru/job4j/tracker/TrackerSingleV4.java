package ru.job4j.tracker;

public class TrackerSingleV4 {
    public Tracker tracker = new Tracker();

    public TrackerSingleV4() {

    }

    public static TrackerSingleV4 getInstance() {
        return Holder.INSTANCE;
    }


    private static final class Holder {
        private static final TrackerSingleV4 INSTANCE = new TrackerSingleV4();
    }
}
