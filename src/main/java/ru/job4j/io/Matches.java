package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static final int PLAYER_1 = 1;
    private static final int PLAYER_2 = 2;

    public static void main(String[] args) {
        int totalCount = 11;
        System.out.println("Смысл игры в следующем. На столе лежат 11 спичек. " +
                           "Два игрока по очереди берут от 1 до 3 спичек. " +
                           "Выигрывает тот, кто забрал последние спички.");
        int move = PLAYER_1;
        Scanner input = new Scanner(System.in);

        while (totalCount > 0) {
            System.out.println("На столе осталось " + totalCount + " спичек.");
            System.out.println("Игрок " + move + ": ");
            int count = Integer.valueOf(input.nextLine());

            if (count < 1 || count > 3) {
                System.out.println("Введите число от 1 до 3");
                continue;
            } else if ((totalCount - count) < 0) {
                System.out.println("Нельзя выбрать более " + totalCount + " спичек.");
                continue;
            }

            totalCount -= count;

            if (totalCount > 0) {
                move = move == PLAYER_1 ? PLAYER_2 : PLAYER_1;
            }
        }

        System.out.println("Победу одержал Игрок " + move);
    }
}
