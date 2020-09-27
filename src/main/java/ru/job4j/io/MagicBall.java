package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    private static final int YES = 0;
    private static final int NO = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case YES:
                System.out.println("Да");
                break;
            case NO:
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
        }

    }
}
