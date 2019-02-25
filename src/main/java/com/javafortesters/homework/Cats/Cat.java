package com.javafortesters.homework.Cats;

public class Cat {
    private String color;
    private Integer age;
    private String breed;
    private String sex;
    private String alias;
    private boolean sleepCondition;


    public Cat(String color, Integer age, String breed, String sex, String alias, boolean sleepCondition) {
        this.color = color;
        this.age = age;
        this.breed = breed;
        this.sex = sex;
        this.alias = alias;
        this.sleepCondition = false;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getSex() {
        return sex;
    }

    public String getAlias() {
        return alias;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }


    public void sleepON() {
        this.sleepCondition = true;
    }

    public void sleepOFF() {
        this.sleepCondition = false;
    }

    public boolean isSleeping() {
        return this.sleepCondition;
    }


    public void meow() {
        System.out.println(getAlias() + " says: " + "MEOW!");
    }
}







