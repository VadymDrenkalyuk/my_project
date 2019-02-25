package com.javafortesters.homework.Cats;

public class Cat1 {
    public static void main(String[] args) {
        Cat bobik = new Cat("black", 20, "Siberian", "female", "bobik", false);
        bobik.sleepON();
        System.out.println(bobik.isSleeping());
        bobik.meow();
    }
}
