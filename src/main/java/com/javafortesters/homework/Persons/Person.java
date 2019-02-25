package com.javafortesters.homework.Persons;

public class Person {
    private String name;
    private Integer age;
    private String gender;
    private Integer weight;

    public Person (String name, Integer age, String gender, Integer weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge (Integer age){
        this.age = age;
    }
    public void setGender (String gender){
        this.gender = gender;
    }
    public void setWeight (Integer weight){
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
}

