package com.javafortesters.homework.Persons;

public class Student extends Person {
    public Integer startYear;
    public Integer finishYear;

    public Student(String name, Integer age, String gender, Integer weight, Integer startYear, Integer finishYear) {
        super(name, age, gender, weight);
        this.startYear = startYear;
        this.finishYear = finishYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public void setFinishYear(Integer finishYear) {
        this.finishYear = finishYear;
    }

    public void increaseYears() {
        finishYear = finishYear + 2;
    }
}
