package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;

        for (int i = 0; i < Math.max(left.length(), right.length()); i++) {
            char leftChar;
            char rightChar;

            try {
                leftChar = left.charAt(i);

            } catch (IndexOutOfBoundsException e) {
                result = -1;
                break;
            }

            try {
                rightChar = right.charAt(i);
            } catch (IndexOutOfBoundsException e) {
                result = 1;
                break;
            }

            result = Character.compare(leftChar, rightChar);

            if (result != 0) {
                break;
            }
        }

        return result;
    }
}
