package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare " + left + " : " + right);
            return left.compareTo(right);
        };

        String[] testStrings = {"Ivanov", "Petrov", "Andreev"};

        Arrays.sort(testStrings, comparator);

        for (String testString : testStrings) {
            System.out.println(testString);
        }
    }
}
