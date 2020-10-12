package ru.job4j.tracker;

public class EditAction implements UserAction{
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        this.out.println("=== Edit Item ====");
        int id = input.askInt("Enter id of source item: ");
        String name = input.askStr("Enter new name of item: ");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            this.out.println("Edit Item success");
        } else {
            this.out.println("Item with that id not found");
        }
        return true;
    }
}
