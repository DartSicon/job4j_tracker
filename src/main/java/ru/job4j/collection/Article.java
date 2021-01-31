package ru.job4j.collection;

import java.util.Arrays;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        List<String> originSplit= Arrays.asList(origin.split("[\\s@&.,?!$+-]+"));
        String[] lineSplit= line.split("[\\s@&.,?!$+-]+");
        boolean result = true;

        for (String word : lineSplit) {
            if (!originSplit.contains(word)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
