package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortItemAscendingTest {
    @Test
    public void whenCallSortThenItemsAscending() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, "3"));
        items.add(new Item(1, "1"));
        items.add(new Item(2, "2"));

        Collections.sort(items, new SortItemAscending());
        Assert.assertEquals(1, items.get(0).getId());
    }
}