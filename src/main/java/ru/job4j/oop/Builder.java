package ru.job4j.oop;

public class Builder extends Engineer {

    private TechnicalEquipment helmet;

    public TechnicalEquipment getHelmet() {
        return helmet;
    }

    public Building build(TechnicalDocumentation documentation, int workingHours) {
        return new Building();
    }
}
