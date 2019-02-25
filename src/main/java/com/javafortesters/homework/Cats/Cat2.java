package com.javafortesters.homework.Cats;

public class Cat2 {
    public static void main(String[] args) {
        Cat walterWhite = new Cat("white", 50, "Chemical god", "male", "Heisenberg", true);
        walterWhite.sleepOFF();
        System.out.println(walterWhite.isSleeping());
        walterWhite.meow();
    }
}
