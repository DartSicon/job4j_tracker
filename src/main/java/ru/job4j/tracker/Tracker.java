package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[this.size];
        int size = 0;

        for (int index = 0; index < this.size; index++) {
            Item item = this.items[index];
            if (item.getName().equals(key)) {
                result[size++] = this.items[index];
            }
        }

        return Arrays.copyOf(result, size);
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = item;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(this.items, index + 1, this.items, index, this.size - index);
            this.items[this.size - 1] = null;
            this.size--;
        }
        return index != -1;
    }
}