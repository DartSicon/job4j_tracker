package ru.job4j.oop;

public class Surgeon extends Doctor {

    private MedicalDevice scalpel;

    public MedicalDevice getScalpel() {
        return scalpel;
    }

    public Patient startOperation (Patient patient, MedicalDevice scalpel) {
        return new Patient();
    }
}
