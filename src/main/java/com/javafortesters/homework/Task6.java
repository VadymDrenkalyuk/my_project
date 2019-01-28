package com.javafortesters.homework;

public class Task6 {
    public static void main(String[] args) {
        int n = 13;
        int m = 5;
        int number = 10;

        int firstDelta = number - n;
        int secondDelta = number - m;

        if (Math.abs(firstDelta) > Math.abs(secondDelta)) {
            System.out.println("m is closer to your number");
        } else {
            System.out.println("n is closer to your number");
        }
    }
}
