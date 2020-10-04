package ru.job4j.tracker;

public interface Transport {
    void ride();

    void passengers(int passengers);

    double fill(int quantity);
}
