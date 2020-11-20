package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        this.out.println("=== Show all items ====");
        for (Item item : tracker.findAll()) {
            this.out.println(item);
        }
        return true;
    }
}
