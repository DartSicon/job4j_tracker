package ru.job4j.oop;

public class Programmer extends Engineer {

    private String[] programLanguages;

    public String[] getProgramLanguages() {
        return programLanguages;
    }

    public Software developSoftware(int workingHours, TechnicalDocumentation documentation) {
        return new Software();
    }
}
