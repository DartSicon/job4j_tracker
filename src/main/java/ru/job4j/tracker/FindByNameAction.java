package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        this.out.println("=== Find Item by name ====");
        String name = input.askStr("Enter name of search Item: ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item item : items) {
                this.out.println(item);
            }
        } else {
            this.out.println("Item with that name not found");
        }
        return true;
    }
}
