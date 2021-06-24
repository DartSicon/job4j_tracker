package ru.job4j.collection;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> comparator = (left, right) -> {
            int result = 0;

            for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
                System.out.println("compare char- " + left.charAt(i) + " : " + right.charAt(i));
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    break;
                }
            }

            if (result == 0) {
                System.out.println("compare size - " + left.length() + " : " + right.length());
                result = Integer.compare(left.length(), right.length());
            }

            return result;
        };
    }
}
