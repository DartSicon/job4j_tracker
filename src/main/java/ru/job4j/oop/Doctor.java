package ru.job4j.oop;

public class Doctor extends Profession {

    private String medicalSpecialization;

    public String getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public Diagnosis heal(Patient patient) {
        return new Diagnosis();
    }
}
