package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        StringBuilder leftNumber = new StringBuilder();
        StringBuilder rightNumber = new StringBuilder();
        boolean leftNumberFound = false;
        boolean rightNumberFound = false;

        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            if (leftNumberFound && rightNumberFound) {
                break;
            }

            if (!leftNumberFound) {
                char leftChar = left.charAt(i);

                if (!Character.isDigit(leftChar)) {
                    leftNumberFound = true;
                } else {
                    leftNumber.append(leftChar);
                }
            }

            if (!rightNumberFound) {
                char rightChar = right.charAt(i);

                if (!Character.isDigit(rightChar)) {
                    rightNumberFound = true;
                } else {
                    rightNumber.append(rightChar);
                }
            }
        }

        return Integer.compare(Integer.parseInt(leftNumber.toString()), Integer.parseInt(rightNumber.toString()));
    }
}
