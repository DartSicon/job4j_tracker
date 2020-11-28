package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("A bug fix", 1),
                new Job("B bug fix", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAsc() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("A bug fix", 1),
                new Job("B bug fix", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("A bug fix", 1),
                new Job("B bug fix", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAsc() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("A bug fix", 1),
                new Job("B bug fix", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameDescAndByPriorityAsc() {
        Comparator<Job> cmpPriority = new JobDescByName().thenComparing(new JobAscByPriority());
        Job firstJobInList = new Job("C Bug fix", 0);
        List<Job> list = new ArrayList<>(List.of(
                new Job("A bug fix", 1),
                new Job("B bug fix", 0),
                firstJobInList,
                new Job("C Bug fix", 1)
        ));

        list.sort(cmpPriority);
        assertThat(firstJobInList, equalTo(list.get(0)));
    }

    @Test
    public void whenComparatorByNameAscAndByPriorityDesc() {
        Comparator<Job> cmpPriority = new JobAscByName().thenComparing(new JobDescByPriority());
        Job firstJobInList = new Job("A bug fix", 1);
        List<Job> list = new ArrayList<>(List.of(
                new Job("A bug fix", 0),
                new Job("B bug fix", 0),
                firstJobInList,
                new Job("C Bug fix", 1)
        ));

        list.sort(cmpPriority);
        assertThat(firstJobInList, equalTo(list.get(0)));
    }
}