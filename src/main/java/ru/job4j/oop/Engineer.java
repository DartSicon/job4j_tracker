package ru.job4j.oop;

public class Engineer extends Profession{
    private String technicalSpecialization;
    private int grade;

    public String getTechnicalSpecialization() {
        return technicalSpecialization;
    }

    public int getGrade() {
        return grade;
    }

    TechnicalDocumentation writeTechnicalDocumentation(Project project) {
        return new TechnicalDocumentation();
    }
}
