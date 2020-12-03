package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        this.out.println("=== Delete Item ====");
        int id = input.askInt("Enter id of item for delete: ");
        if (tracker.delete(id)) {
            this.out.println("Delete Item success");
        } else {
            this.out.println("Item with that id not found");
        }
        return true;
    }
}
