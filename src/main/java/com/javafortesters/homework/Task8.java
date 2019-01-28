package com.javafortesters.homework;

public class Task8 {
    public static void main(String[] args) {
        double a = 2;
        int b = 0;

        while (b<=20) {
            System.out.println(Math.scalb(a, b));
            b ++;
        }

    }
}
