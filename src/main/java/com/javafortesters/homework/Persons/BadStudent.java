package com.javafortesters.homework.Persons;

public class BadStudent {
    public static void main(String[] args) {
        Student badStudent = new Student("Vasya", 58, "male", 67, 1956, 2025);
        badStudent.increaseYears();
        System.out.println(badStudent.finishYear);
    }
}
