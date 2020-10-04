package ru.job4j.poly;

public class Bus implements Transport {
    private int passengers;
    private int fuel;

    @Override
    public void ride() {
        System.out.println("Автобус поехал с " + this.passengers + " пассажирами. Кол-во топлива: " + this.fuel);
    }

    @Override
    public void passengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public double fill(int quantity) {
        fuel += quantity;
        return Gasoline.PRICE * quantity;
    }
}
