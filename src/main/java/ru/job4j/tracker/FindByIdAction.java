package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        this.out.println("=== Find Item by id ====");
        int id = input.askInt("Enter id of search Item: ");
        Item item = tracker.findById(id);
        if (item != null) {
            this.out.println(item);
        } else {
            this.out.println("Item with that id not found");
        }
        return true;
    }
}
