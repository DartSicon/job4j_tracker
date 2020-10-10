package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id of item for delete: ");
        if (tracker.delete(id)) {
            System.out.print("Delete Item success");
        } else {
            System.out.print("Item with that id not found");
        }
        return true;
    }
}
