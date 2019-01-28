package com.javafortesters.homework;

public class Task6 {
    public static void main(String[] args) {
        int n = 7;
        int m = 13;
        int number = 10;

        int firstDelta = number - n;
        int secondDelta = number - m;

        if (Math.abs(firstDelta) > Math.abs(secondDelta)) {
            System.out.println("m is closer to your number");
        }

        if (Math.abs(firstDelta) < Math.abs(secondDelta)) {
            System.out.println("n is closer to your number");
        }

        if (Math.abs(firstDelta) == Math.abs(secondDelta)) {
            System.out.println("m and n is equally close to your number");
        }
    }
}
