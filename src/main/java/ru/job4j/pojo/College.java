package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иванович");
        student.setGroup("Э-102");
        student.setReceiptDate(new Date());

        System.out.println("Студент: "
                + student.getFio()
                + ", "
                + "группа: "
                + student.getGroup()
                + ", "
                + "дата поступления: "
                + student.getReceiptDate());

    }
}
