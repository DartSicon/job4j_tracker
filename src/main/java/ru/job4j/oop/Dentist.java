package ru.job4j.oop;

public class Dentist extends Doctor {

    MedicalDevice drill;

    public MedicalDevice getDrill() {
        return drill;
    }

    public Patient removeTooth(Patient patient, int toothNumber) {
        return new Patient();
    }
}
