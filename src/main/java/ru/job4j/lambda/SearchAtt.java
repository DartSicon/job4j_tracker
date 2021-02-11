package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> sizeGreater100 = attachment -> attachment.getSize() > 100;

        return filter(list, sizeGreater100);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> nameBug = attachment -> attachment.getName().contains("bug");

        return filter(list, nameBug);
    }

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> filterFunction) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (filterFunction.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}