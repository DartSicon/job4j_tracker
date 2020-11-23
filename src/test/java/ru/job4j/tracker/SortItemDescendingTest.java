package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortItemDescendingTest {
    @Test
    public void whenCallSortThenItemsDescending() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3));
        items.add(new Item(1));
        items.add(new Item(2));

        Collections.sort(items, new SortItemDescending());
        Assert.assertEquals(3, items.get(0).getId());
    }
}