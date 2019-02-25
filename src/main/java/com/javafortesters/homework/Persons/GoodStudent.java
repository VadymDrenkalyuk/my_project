package com.javafortesters.homework.Persons;

public class GoodStudent {
    public static void main(String[] args) {
        Student goodStudent = new Student("Peter", 21, "male", 180, 1999, 2003);
        System.out.println(goodStudent.getName());
        System.out.println(goodStudent.finishYear);
    }
}
