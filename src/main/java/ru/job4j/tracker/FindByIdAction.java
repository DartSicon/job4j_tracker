package ru.job4j.tracker;

public class FindByIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find Item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id of search Item: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.print("Item with that id not found");
        }
        return true;
    }
}
