package ru.job4j.tracker;

public class EditAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id of source item: ");
        String name = input.askStr("Enter new name of item: ");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            System.out.print("Edit Item success");
        } else {
            System.out.print("Item with that id not found");
        }
        return true;
    }
}
