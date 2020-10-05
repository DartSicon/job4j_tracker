package ru.job4j.oop;

public class Road {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Train train = new Train();
        Bus bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{ airplane, train, bus };
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
