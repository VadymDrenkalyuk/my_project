package com.javafortesters.homework;

public class AdditionConsole {
    public static void main(String[] args) {
        String c = args[0];
        String d = args[1];
        int a = Integer.parseInt(c);
        int b = Integer.parseInt(d);
        int result = a+b;
        System.out.println(result);
    }
}
